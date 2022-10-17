package irvine.games;

import java.util.Arrays;

/**
 * Ordinary Rubik cube.
 * @author Sean A. Irvine
 */
public class RubikCube {

  // Each face is represented by 8 consecutive positions in mState (the middle cell
  // is not stored because it is fixed).
  // Front: 0-7
  // Top: 8-15
  // Right: 16-23
  // Bottom: 24-31
  // Left: 32-39
  // Back: 40-47
  //
  // Assuming looking directly at these faces, the numberings are:
  // Front      Top       Right     Bottom    Left       Back
  //  0  1  2   10 11 12  16 17 18  26 25 24  36 35 34   42 41 40
  //  7  .  3    9  . 13  23  . 19  27  . 31  37  . 33   43  . 47
  //  6  5  4    8 15 14  22 21 20  28 29 30  38 39 32   44 45 46
  //
  // For each possible move we determine (a,b) transitions meaning a -> b when the
  // specified move is performed. The pairs (a,b) are packed into a single array
  // given a0 then b0, a1 then b1, etc.

  /**
   * Moves on the cube assuming viewed from an arbitrary front position.
   */
  public enum RubikMove {
    /** Front clockwise. */
    F(0, 2, 1, 3, 2, 4, 3, 5, 4, 6, 5, 7, 6, 0, 7, 1, 8, 16, 15, 23, 14, 22, 16, 24, 23, 25, 22, 26, 24, 32, 25, 33, 26, 34, 32, 8, 33, 15, 34, 14),
    /** Front anticlockwise. */
    G(2, 0, 3, 1, 4, 2, 5, 3, 6, 4, 7, 5, 0, 6, 1, 7, 16, 8, 23, 15, 22, 14, 24, 16, 25, 23, 26, 22, 32, 24, 33, 25, 34, 26, 8, 32, 15, 33, 14, 34),
    /** Top (upper) clockwise. */
    U(8, 10, 9, 11, 10, 12, 11, 13, 12, 14, 13, 15, 14, 8, 15, 9, 16, 0, 17, 1, 18, 2, 42, 16, 41, 17, 40, 18, 36, 42, 35, 41, 34, 40, 0, 36, 1, 35, 2, 34),
    /** Top (upper) anticlockwise. */
    V(10, 8, 11, 9, 12, 10, 13, 11, 14, 12, 15, 13, 8, 14, 9, 15, 0, 16, 1, 17, 2, 18, 16, 42, 17, 41, 18, 40, 42, 36, 41, 35, 40, 34, 36, 0, 35, 1, 34, 2),
    /** Bottom (down) clockwise. */
    D(24, 26, 25, 27, 26, 28, 27, 29, 28, 30, 29, 31, 30, 24, 31, 25, 4, 32, 5, 39, 6, 38, 32, 46, 39, 45, 38, 44, 46, 20, 45, 21, 44, 22, 20, 4, 21, 5, 22, 6),
    /** Bottom (down) anticlockwise. */
    E(26, 24, 27, 25, 28, 26, 29, 27, 30, 28, 31, 29, 24, 30, 25, 31, 32, 4, 39, 5, 38, 6, 46, 32, 45, 39, 44, 38, 20, 46, 21, 45, 22, 44, 4, 20, 5, 21, 6, 22),
    /** Left clockwise. */
    L(32, 38, 33, 39, 34, 32, 35, 33, 36, 34, 37, 35, 38, 36, 39, 37, 0, 26, 7, 27, 6, 28, 26, 46, 27, 47, 28, 40, 46, 10, 47, 9, 40, 8, 10, 0, 9, 7, 8, 6),
    /** Left anticlockwise. */
    M(38, 32, 39, 33, 32, 34, 33, 35, 34, 36, 35, 37, 36, 38, 37, 39, 26, 0, 27, 7, 28, 6, 46, 26, 47, 27, 40, 28, 10, 46, 9, 47, 8, 40, 0, 10, 7, 9, 6, 8),
    /** Right clockwise. */
    R(16, 18, 17, 19, 18, 20, 19, 21, 20, 22, 21, 23, 22, 16, 23, 17, 2, 12, 3, 13, 4, 14, 12, 44, 13, 43, 14, 42, 42, 30, 43, 31, 44, 24, 24, 2, 31, 3, 30, 4),
    /** Right anticlockwise. */
    S(18, 16, 19, 17, 20, 18, 21, 19, 22, 20, 23, 21, 16, 22, 17, 23, 12, 2, 13, 3, 14, 4, 44, 12, 43, 13, 42, 14, 30, 42, 31, 43, 24, 44, 2, 24, 3, 31, 4, 30),
    /** Back clockwise. */
    B(40, 42, 41, 43, 42, 44, 43, 45, 44, 46, 45, 47, 46, 40, 47, 41, 10, 18, 11, 19, 12, 20, 18, 30, 19, 29, 20, 28, 28, 36, 29, 37, 30, 38, 36, 12, 37, 11, 38, 10),
    /** Back anticlockwise. */
    C(42, 40, 43, 41, 44, 42, 45, 43, 46, 44, 47, 45, 40, 46, 41, 47, 18, 10, 19, 11, 20, 12, 30, 18, 29, 19, 28, 20, 36, 28, 37, 29, 38, 30, 12, 36, 11, 37, 10, 38)
    ;

    private final int[] mTransitions;

    RubikMove(final int... transitions) {
      assert (transitions.length & 1) == 0;
      mTransitions = transitions;
    }

    private static final RubikMove[] INVERSES = {G, F, V, U, E, D, M, L, S, R, C, B};

    /**
     * The inverse of a move.
     * @param move move to get inverse of
     * @return inverse move
     */
    public static RubikMove inverse(final RubikMove move) {
      return INVERSES[move.ordinal()];
    }
  }

  private static final int[] IDENTITY = {
    0, 0, 0, 0, 0, 0, 0, 0,
    1, 1, 1, 1, 1, 1, 1, 1,
    2, 2, 2, 2, 2, 2, 2, 2,
    3, 3, 3, 3, 3, 3, 3, 3,
    4, 4, 4, 4, 4, 4, 4, 4,
    5, 5, 5, 5, 5, 5, 5, 5
  };

  private final int[] mState;

  /**
   * Construct a fresh cube in the identity state (i.e., complete).
   */
  public RubikCube() {
    mState = Arrays.copyOf(IDENTITY, IDENTITY.length);
  }

  /**
   * Test if the cube is in the identity state.
   * @return true iff the cube is in the identity state
   */
  public boolean isIdentity() {
    return Arrays.equals(mState, IDENTITY);
  }

  /**
   * Apply the specified move to the cube.
   * @param move move to apply
   */
  public void apply(final RubikMove move) {
    final int[] orig = Arrays.copyOf(mState, mState.length);
    final int[] t = move.mTransitions;
    for (int k = 0; k < t.length; k += 2) {
      mState[t[k + 1]] = orig[t[k]];
    }
  }
}

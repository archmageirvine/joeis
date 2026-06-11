package irvine.oeis.a395;

import java.util.HashMap;

import irvine.math.HexSpiral;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395365 Walk along the hexagonal spiral, with its cells numbered starting at 0, as in A395362. Two players, Black and Red, take turns. When it is Black's turn, he places a knight at the smallest unoccupied cell not attacked by an existing Red knight, and when it is Red's turn, she places a knight at the smallest unoccupied cell not attacked by an existing Black knight. Sequence lists cells occupied by Black knights.
 * @author Sean A. Irvine
 */
public class A395365 extends Sequence0 {

  private static final int[][] KNIGHT_ATTACKS = {
    {2, 1},
    {3, -1},

    {1, 2},
    {-1, 3},

    {-2, 3},
    {-3, 2},

    {-3, 1},
    {-2, -1},

    {-1, -2},
    {1, -3},

    {2, -3},
    {3, -2}
  };

  private final HashMap<Long, Byte> mForbidden = new HashMap<>();
  private final HexSpiral[] mSpirals;
  private final long[] mPositions;
  private final int mColors;
  private final int mKnight;

  protected A395365(final int colors, final int knight) {
    if (colors > 8) {
      // Can do more if Byte in forbidden is promoted
      throw new UnsupportedOperationException();
    }
    if (knight >= colors) {
      throw new IllegalStateException();
    }
    mColors = colors;
    mKnight = knight;
    mPositions = new long[colors];
    mSpirals = new HexSpiral[colors];
    for (int k = 0; k < colors; ++k) {
      mSpirals[k] = new HexSpiral();
    }
  }

  /** Construct the sequence. */
  public A395365() {
    this(2, 0);
  }

  @Override
  public Z next() {
    for (int c = 0; c < mColors; ++c) {
      while (true) {
        final long pos = mSpirals[c].next();
        ++mPositions[c];
        if ((mForbidden.getOrDefault(pos, (byte) 0) & (1 << c)) == 0) {
          final int q = HexSpiral.q(pos);
          final int r = HexSpiral.r(pos);
          for (int[] k : KNIGHT_ATTACKS) {
            final long pt = HexSpiral.pack(q + k[0], r + k[1]);
            mForbidden.merge(pt, (byte) ~(1 << c), (u, v) -> (byte) (u | v));
          }
          mForbidden.put(pos, (byte) ~0); // Cell is occupied by a knight
          break;
        }
      }
    }
    return Z.valueOf(mPositions[mKnight] - 1);
  }
}

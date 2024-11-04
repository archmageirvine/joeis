package irvine.oeis.a377;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A377573 Number of words of length n that reduce to the identity when using the presentation S^7, T^2, (ST)^2 of the 14-element dihedral group D7.
 * @author Sean A. Irvine
 */
public class A377573 extends Sequence0 {

  // After method described by Allan Wechsler on SeqFan mailing list, 2024-11-02

  private final int[][] mTransitions;
  private final long mMod;
  private final long mResidue;
  private Z[] mCounts = null;
  private long mN = -1;

  protected A377573(final int[][] transitions, final long mod, final long residue) {
    mTransitions = transitions;
    mMod = mod;
    mResidue = residue;
  }

  protected A377573(final int[][] transitions) {
    this(transitions, 1, 0);
  }

  /** Construct the sequence. */
  public A377573() {
    this(new int[][] {
      {1, 7},  // 0
      {2, 8},  // 1
      {3, 9},  // 2
      {4, 10}, // 3
      {5, 11}, // 4
      {6, 12}, // 5
      {0, 13}, // 6
      {0, 13}, // 7
      {1, 7},  // 8
      {2, 8},  // 9
      {3, 9},  // 10
      {4, 10}, // 11
      {5, 11}, // 12
      {6, 12}, // 13
    });
  }

  @Override
  public Z next() {
    while (true) {
      if (mCounts == null) {
        mCounts = new Z[mTransitions.length];
        Arrays.fill(mCounts, Z.ZERO);
        mCounts[0] = Z.ONE;
      } else {
        final Z[] c = new Z[mCounts.length];
        for (int k = 0; k < c.length; ++k) {
          Z s = Z.ZERO;
          for (final int t : mTransitions[k]) {
            s = s.add(mCounts[t]);
          }
          c[k] = s;
        }
        mCounts = c;
      }
      if (++mN % mMod == mResidue) {
        return mCounts[0];
      }
    }
  }
}


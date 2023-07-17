package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Permutation;

/**
 * A049354 Digitally balanced numbers in base 3: equal numbers of 0's, 1's, 2's.
 * @author Sean A. Irvine
 */
public class A049354 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A049354(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A049354() {
    super(1);
  }

  private Permutation mPerm = new Permutation(new int[]{0});
  private int mRep = 0;

  protected int base() {
    return 3;
  }

  @Override
  public Z next() {
    while (true) {
      final int[] p = mPerm.next();
      if (p == null) {
        ++mRep;
        final int[] perm = new int[base() * mRep];
        for (int d = 0, j = 0; d < base(); ++d) {
          for (int s = mRep; s > 0; --s, ++j) {
            perm[j] = d;
          }
        }
        mPerm = new Permutation(perm);
      } else if (p[0] != 0) {
        final StringBuilder sb = new StringBuilder();
        for (final int d : p) {
          sb.append(d);
        }
        return new Z(sb, base());
      }
    }
  }
}

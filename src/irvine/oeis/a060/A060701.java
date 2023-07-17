package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a008.A008302;

/**
 * A060701 Table by antidiagonals of Mahonian numbers T(n,k): permutations of n letters with k inversions.
 * @author Sean A. Irvine
 */
public class A060701 extends A008302 {

  /** Construct the sequence. */
  public A060701() {
    super(0);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mM, mN + 1 - mM);
  }
}

package irvine.oeis.a337;

import irvine.math.polynomial.PalmerSymPowerCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.a003.A003190;

/**
 * A337884 Array read by descending antidiagonals: T(n,k) is the number of unoriented colorings of the triangular faces of a regular n-dimensional simplex using k or fewer colors.
 * @author Sean A. Irvine
 */
public class A337884 extends A003190 {

  /** Construct the sequence. */
  public A337884() {
    super(2);
  }

  private int mN = 3;
  private int mM = 2;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 3;
    }
    return new PalmerSymPowerCycleIndex().cycleIndex(3, mM).eval(mN - mM).toZ();
  }
}

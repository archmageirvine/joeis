package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a035.A035143;

/**
 * A055668 Number of inequivalent Eisenstein-Jacobi primes of norm n.
 * @author Sean A. Irvine
 */
public class A055668 extends A035143 {

  private final Sequence mNorms = new A055664();
  private long mM = 0;

  /** Construct the sequence. */
  public A055668() {
    super(-3);
  }

  @Override
  public Z next() {
    if (mM == 0) {
      mM = mNorms.next().longValueExact();
      return Z.ZERO;
    }
    if (mN < mM - 1) {
      super.next();
      return Z.ZERO;
    }
    mM = mNorms.next().longValueExact();
    return super.next();
  }
}

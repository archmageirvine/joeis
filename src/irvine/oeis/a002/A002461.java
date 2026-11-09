package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002461 Coefficients of Legendre polynomials in terms of the expansion of sqrt(1+x).
 * @author Sean A. Irvine
 */
public class A002461 extends A002596 {

  /** Construct the sequence. */
  public A002461() {
    super(2);
  }

  private int mN = 1;

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    } else {
      return super.next().abs().multiply(mN);
    }
  }
}

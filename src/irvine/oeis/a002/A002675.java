package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002675 Numerators of coefficients for central differences M_{4}^(2*n).
 * @author Sean A. Irvine
 */
public class A002675 extends A002672 {

  /** Construct the sequence. */
  public A002675() {
    super(2);
  }

  private int mN = 2;

  @Override
  public Z next() {
    mN += 2;
    return bigM(4, mN).num();
  }
}

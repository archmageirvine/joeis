package irvine.oeis.a134;

import irvine.math.z.Z;

/**
 * A134763 a(n) = (1/2)*( (1+(-1)^n)*A134762(n/2) + 2*(1-(-1)^n) ).
 * @author Georg Fischer
 */
public class A134763 extends A134762 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? Z.TWO : super.next();
  }
}

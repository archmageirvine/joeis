package irvine.oeis.a285;
// manually sigman1/sigma1 at 2023-02-28 22:58

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a064.A064216;

/**
 * A285705 a(n) =  2*n - A285703(n) = 2*n - A000203(A064216(n)).
 * @author Georg Fischer
 */
public class A285705 extends A064216 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(2L * mN).subtract(Jaguar.factor(super.next()).sigma());
  }
}

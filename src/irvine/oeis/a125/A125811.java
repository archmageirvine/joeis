package irvine.oeis.a125;
// manually dersimple at 2021-08-25 19:44

import irvine.math.z.Z;
import irvine.oeis.a023.A023536;

/**
 * A125811 Number of coefficients in the n-th q-Bell number as a polynomial in q.
 * @author Georg Fischer
 */
public class A125811 extends A023536 {

  private int mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    return mN <= 3 ? Z.ONE : super.next().add(1);
  }
}

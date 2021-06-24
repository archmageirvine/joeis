package irvine.oeis.a172;
// manually 2021-06-24

import irvine.math.z.Z;
import irvine.oeis.a030.A030078;

/**
 * A172190 a(n) = 2*prime(n)^3.
 * @author Georg Fischer
 */
public class A172190 extends A030078 {

  @Override
  public Z next() {
    return super.next().multiply2();
  } // next
}

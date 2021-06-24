package irvine.oeis.a172;
// manually 2021-06-24

import irvine.math.z.Z;
import irvine.oeis.a030.A030514;

/**
 * A172191 a(n) = 2*prime(n)^4.
 * @author Georg Fischer
 */
public class A172191 extends A030514 {

  @Override
  public Z next() {
    return super.next().multiply2();
  } // next
}

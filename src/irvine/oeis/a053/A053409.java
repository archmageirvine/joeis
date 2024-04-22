package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a072.A072381;

/**
 * A053409 Fibonacci numbers which are semiprimes.
 * @author Sean A. Irvine
 */
public class A053409 extends A072381 {

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}

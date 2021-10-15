package irvine.oeis.a052;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a038.A038546;

/**
 * A052000 Fibonacci(k) starting with digits of its index number k.
 * @author Sean A. Irvine
 */
public class A052000 extends A038546 {

  @Override
  public Z next() {
    return Fibonacci.fibonacci(super.next().intValueExact());
  }
}

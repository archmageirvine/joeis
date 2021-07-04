package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a022.A022290;
import irvine.oeis.a038.A038183;

/**
 * A048757 Sum_{i=0..2n} (C(2n,i) mod 2)*Fibonacci(i+2) = Sum_{i=0..n} (C(n,i) mod 2)*Fibonacci(2i+2).
 * @author Sean A. Irvine
 */
public class A048757 extends A038183 {

  @Override
  public Z next() {
    return A022290.zeckendorf(super.next());
  }
}

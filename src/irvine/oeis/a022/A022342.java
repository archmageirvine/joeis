package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000201;

/**
 * A022342 Integers with "even" Zeckendorf expansions (do not end with ...+F_2 = ...+1) (the Fibonacci-even numbers); also, apart from first term, a(n) = Fibonacci successor to n-1.
 * @author Sean A. Irvine
 */
public class A022342 extends A000201 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

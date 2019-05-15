package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000201;

/**
 * A022342 Integers with "even" Zeckendorf expansions (do not end with <code>...+F1 = ...+1)</code> (the <code>Fibonacci-even</code> numbers); also, apart from first term, <code>a(n) =</code> Fibonacci successor to <code>n-1</code>.
 * @author Sean A. Irvine
 */
public class A022342 extends A000201 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

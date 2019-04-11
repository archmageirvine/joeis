package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001177 Fibonacci entry points: <code>a(n) =</code> least <code>k &gt;= 1</code> such that n divides Fibonacci number F_k (=A000045(k)).
 * @author Sean A. Irvine
 */
public class A001177 extends A001175 {

  private final A001176 mZeros = new A001176();

  @Override
  public Z next() {
    return super.next().divide(mZeros.next());
  }
}

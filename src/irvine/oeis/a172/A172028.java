package irvine.oeis.a172;
// Generated by gen_seq4.pl cordrectab/cordrec at 2022-07-15 23:04

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A172028 a(1) = 2; for n &gt; 1, a(n) = smallest k such that a(n-1)^3+k is a cube.
 * <code>a(n)=1+3*a(n-1)*(1+a(n-1))</code>
 * @author Georg Fischer
 */
public class A172028 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A172028() {
    super(1, 1, 0, 2);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(3).multiply(a(n - 1).add(1)).add(1);
  }
}

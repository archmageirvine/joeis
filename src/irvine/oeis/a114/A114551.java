package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A114551 Continued fraction expansion of the constant (A114550) equal to Sum_{n&gt;=0} 1/A112373(n) such that the partial quotients satisfy a(2n) = A112373(n) for n &gt; 0 and a(2n+1) = A112373(n+1)/A112373(n) for n &gt;= 0.
 * such that the partial quotients satisfy a(2n) = A112373(n) for n &gt; 0 and a(2n+1) = A112373(n+1)/A112373(n) for n &gt;= 0.
 * @author Georg Fischer
 */
public class A114551 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A114551() {
    super(0, 2, 0, 2, 1, 1, 2);
  }

  // a(n-1)*a(n-2)+(n%2)*a(n-2)))
  protected Z compute(final int n) {
    return a(n - 1).multiply(a(n - 2)).add(a(n - 2).multiply(n & 1));
  }
}

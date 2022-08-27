package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A114552 Odd-indexed bisection of A114551, which is the continued fraction expansion of Sum_{n&gt;=0} 1/A112373(n); also, a(n) = A112373(n+1)/A112373(n) for n&gt;=0.
 * @author Georg Fischer
 */
public class A114552 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A114552() {
    super(0, 2, 0, 1, 2, 6);
  }

  // a(n) = a(n-1)*(1 - a(n-1) + a(n-1)^2/a(n-2)) for n&gt;=2
  protected Z compute(final int n) {
    final Z an1 = a(n - 1);
    return an1.subtract(an1.square()).add(an1.pow(3).divide(a(n - 2)));
  }
}

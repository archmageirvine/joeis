package irvine.oeis.a241;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A241662 Numbers of the form m * 10^k where gcd(10, m) = 1 and k &gt;= 0 and m &gt; 0.
 * @author Sean A. Irvine
 */
public class A241662 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A241662() {
    super(1, 1, 0, (m, k) -> Z.TEN.pow(k).multiply(m));
  }

  @Override
  protected boolean accept(final long m, final long k, final Z n, final Z prev) {
    return Functions.GCD.l(10, m) == 1;
  }
}


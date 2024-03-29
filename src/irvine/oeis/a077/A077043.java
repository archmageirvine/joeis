package irvine.oeis.a077;
// Generated by gen_seq4.pl caelem/ca1whites at 2021-12-16 21:00

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A077043 "Three-quarter squares": a(n) = n^2 - A002620(n).
 * @author Georg Fischer
 */
public class A077043 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A077043() {
    super(78);
  }

  @Override
  public Z next() {
    return super.nextWhiteSum();
  }
}

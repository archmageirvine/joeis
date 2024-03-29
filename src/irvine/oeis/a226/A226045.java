package irvine.oeis.a226;
// Generated by gen_seq4.pl rootet at 2023-02-20 12:05

import irvine.oeis.a187.A187746;
import irvine.oeis.transform.RootSequence;

/**
 * A226045 G.f.: ( Sum_{n&gt;=0} (2*n+x)^n * x^n / (1 + 2*n*x + x^2)^n )^(1/2).
 * @author Georg Fischer
 */
public class A226045 extends RootSequence {

  /** Construct the sequence. */
  public A226045() {
    super(0, new A187746().skip(1), 1, 2);
  }
}

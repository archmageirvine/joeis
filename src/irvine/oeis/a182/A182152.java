package irvine.oeis.a182;
// manually rootet at 2023-02-20 10:45

import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007318;
import irvine.oeis.transform.RootSequence;

/**
 * A182152 G.f.: [Sum_{n&gt;=0} x^(n*(n+1)/2) * (1+x)^n ]^3.
 * @author Georg Fischer
 */
public class A182152 extends RootSequence {

  /** Construct the sequence. */
  public A182152() {
    super(0, new SkipSequence(new A007318(), 1), 3, 1);
  }
}

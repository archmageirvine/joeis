package irvine.oeis.a068;

import irvine.oeis.InverseSequence;

/**
 * A068797 Minimum x such that f(x)=n, where f(x)=A068796(x) is the maximum k such that k consecutive integers starting at x have distinct numbers of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A068797 extends InverseSequence {

  /** Construct the sequence. */
  public A068797() {
    super(1, new A068796());
  }
}

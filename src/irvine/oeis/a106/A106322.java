package irvine.oeis.a106;

import irvine.oeis.BriefSequence;

/**
 * A106322 Larger member of a Bhaskara pair (excluding Bhaskara twins, i.e., include only a &lt; b), sorted on the larger value; a Bhaskara pair (a,b) is such that a^2 + b^2 = X^3 and a^3 + b^3 = Y^2.
 * @author Georg Fischer
 */
public class A106322 extends BriefSequence {

  /** Construct the sequence. */
  public A106322() {
    super(1, BRIEF, 1250, 80000, 911250);
  }
}

package irvine.oeis.a106;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A106321 Smaller member of a Bhaskara pair (excluding Bhaskara twins, that is, include only a &lt; b); a Bhaskara pair (a,b) is such that a^2 + b^2 = X^3 and a^3 + b^3 = Y^2.
 *
 * @author Georg Fischer
 */
public class A106321 extends BriefSequence {

  /** Construct the sequence. */
  public A106321() {
    super(1, BRIEF, new Z("625"), new Z("40000"), new Z("455625"));
  }
}

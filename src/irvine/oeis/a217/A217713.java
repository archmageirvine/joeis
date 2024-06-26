package irvine.oeis.a217;
// Generated by gen_seq4.pl 2024-03-30/lambdan at 2024-03-30 20:29

import irvine.math.cr.CR;
import irvine.oeis.LambdaSequence;

/**
 * A217713 Integer part of log(n)^2.
 * @author Georg Fischer
 */
public class A217713 extends LambdaSequence {

  /** Construct the sequence. */
  public A217713() {
    super(0, n -> CR.valueOf(n + 1).log().square().floor());
  }
}

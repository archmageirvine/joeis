package irvine.oeis.a130;
// Generated by gen_seq4.pl 2024-04-17/lambdan at 2024-04-17 19:29

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.LambdaSequence;

/**
 * A130082 Smallest number whose eighth power has at least n digits.
 * @author Georg Fischer
 */
public class A130082 extends LambdaSequence {

  /** Construct the sequence. */
  public A130082() {
    super(1, n -> CR.TEN.pow(new Q(n - 1, 8)).ceil());
  }
}

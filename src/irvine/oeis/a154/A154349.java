package irvine.oeis.a154;
// Generated by gen_seq4.pl dirtraf at 2024-02-05 19:10

import irvine.oeis.a001.A001006;
import irvine.oeis.a152.A152770;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A154349 Sum of proper divisors minus the number of proper divisors of Motzkin number A001006(n).
 * @author Georg Fischer
 */
public class A154349 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A154349() {
    super(0, new A152770(), new A001006());
  }
}

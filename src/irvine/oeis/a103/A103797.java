package irvine.oeis.a103;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a019.A019565;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A103797 Indices of n such that A019565(n)-1 is prime.
 * @author Georg Fischer
 */
public class A103797 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A103797() {
    super(0, 0, new SimpleTransformSequence(new A019565(), t -> t.add(-1)), PRIME);
  }
}

package irvine.oeis.a246;
// Generated by gen_seq4.pl 2023-09-08/filtpos at 2023-09-08 15:21

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a003.A003961;

/**
 * A246261 Numbers n such that A003961(n) is of the form 4k+1.
 * @author Georg Fischer
 */
public class A246261 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A246261() {
    super(1, 1, new A003961(), v -> v.mod(4) == 1);
  }
}

package irvine.oeis.a241;
// Generated by gen_seq4.pl 2024-04-02/filtpos at 2024-04-02 23:05

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a065.A065806;

/**
 * A241671 Where zeros occur in A065806.
 * @author Georg Fischer
 */
public class A241671 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A241671() {
    super(1, 1, new A065806(), ZERO);
  }
}

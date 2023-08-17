package irvine.oeis.a088;
// manually robots/union2 at 2023-08-15 15:43

import irvine.oeis.UnionSequence;
import irvine.oeis.a002.A002981;
import irvine.oeis.a002.A002982;

/**
 * A088412 A088258 indexed by A000142.
 * @author Georg Fischer
 */
public class A088412 extends UnionSequence {

  /** Construct the sequence. */
  public A088412() {
    super(1, new A002981().skip(1), new A002982());
  }
}

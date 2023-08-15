package irvine.oeis.a350;

import irvine.oeis.UnionSequence;
import irvine.oeis.a103.A103974;

/**
 * A350916 Positive integers k such that (k+1)^4 has a divisor congruent to -1 modulo k.
 * @author Georg Fischer
 */
public class A350916 extends UnionSequence {

  /** Construct the sequence. */
  public A350916() {
    super(1, new A350919(), new A350920(), new A350921(), new A350922(), new A350923(), new A103974(), new A350924(), new A350925(), new A350926(), new A350917());
  }
}

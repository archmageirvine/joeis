package irvine.oeis.a393;

import irvine.oeis.Combiner;
import irvine.oeis.a002.A002884;
import irvine.oeis.a028.A028362;

/**
 * A393299 allocated for Geoffrey Critzer.
 * @author Sean A. Irvine
 */
public class A393299 extends Combiner {

  /** Construct the sequence. */
  public A393299() {
    super(0, new A028362(), new A002884(), MULTIPLY);
  }
}

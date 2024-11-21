package irvine.oeis.a073;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000796;
import irvine.oeis.a001.A001113;

/**
 * A073177 (n-th digit of Pi) times (n-th digit of e).
 * @author Sean A. Irvine
 */
public class A073177 extends Combiner {

  /** Construct the sequence. */
  public A073177() {
    super(0, new A000796(), new A001113(), MULTIPLY);
  }
}

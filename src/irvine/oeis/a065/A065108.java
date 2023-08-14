package irvine.oeis.a065;

import irvine.oeis.a000.A000045;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A065084.
 * @author Sean A. Irvine
 */
public class A065108 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A065108() {
    super(1, new A000045().skip(3));
  }
}

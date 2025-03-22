package irvine.oeis.a076;

import irvine.oeis.FilterSequence;

/**
 * A076082.
 * @author Sean A. Irvine
 */
public class A076154 extends FilterSequence {

  /** Construct the sequence. */
  public A076154() {
    super(1, new A076157(), k -> k.mod(5) == 0);
  }
}

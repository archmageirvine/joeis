package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042207 Denominators of continued fraction convergents to <code>sqrt(629)</code>.
 * @author Sean A. Irvine
 */
public class A042207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042207() {
    super(new long[] {1, 0, 0, 0, 0, 15700, 0, 0, 0, 0}, new long[] {1, 12, 13, 25, 313, 15675, 188413, 204088, 392501, 4914100});
  }
}

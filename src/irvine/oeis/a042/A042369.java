package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042369 Denominators of continued fraction convergents to <code>sqrt(711)</code>.
 * @author Sean A. Irvine
 */
public class A042369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042369() {
    super(new long[] {-1, 0, 0, 0, 160, 0, 0, 0}, new long[] {1, 1, 2, 3, 158, 161, 319, 480});
  }
}

package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042769 Denominators of continued fraction convergents to <code>sqrt(915)</code>.
 * @author Sean A. Irvine
 */
public class A042769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042769() {
    super(new long[] {-1, 0, 242, 0}, new long[] {1, 4, 241, 968});
  }
}

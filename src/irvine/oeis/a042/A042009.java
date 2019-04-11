package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042009 Denominators of continued fraction convergents to <code>sqrt(527)</code>.
 * @author Sean A. Irvine
 */
public class A042009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042009() {
    super(new long[] {-1, 0, 0, 0, 1056, 0, 0, 0}, new long[] {1, 1, 22, 23, 1034, 1057, 23231, 24288});
  }
}

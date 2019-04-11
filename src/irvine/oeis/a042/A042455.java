package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042455 Denominators of continued fraction convergents to <code>sqrt(755)</code>.
 * @author Sean A. Irvine
 */
public class A042455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042455() {
    super(new long[] {-1, 0, 0, 0, 2418, 0, 0, 0}, new long[] {1, 2, 21, 44, 2397, 4838, 50777, 106392});
  }
}

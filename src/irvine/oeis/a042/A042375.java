package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042375 Denominators of continued fraction convergents to sqrt(714).
 * @author Sean A. Irvine
 */
public class A042375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042375() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8230, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 7, 18, 25, 43, 111, 154, 8119, 8273, 24665, 32938, 57603, 148144, 205747, 353891, 913529, 1267420});
  }
}

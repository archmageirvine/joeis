package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042815 Denominators of continued fraction convergents to <code>sqrt(938)</code>.
 * @author Sean A. Irvine
 */
public class A042815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042815() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 34302, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 8, 67, 142, 209, 351, 560, 33951, 34511, 68462, 102973, 274408, 2298237, 4870882, 7169119, 12040001, 19209120});
  }
}

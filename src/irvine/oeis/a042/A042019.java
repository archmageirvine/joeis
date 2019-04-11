package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042019 Denominators of continued fraction convergents to <code>sqrt(533)</code>.
 * @author Sean A. Irvine
 */
public class A042019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042019() {
    super(new long[] {1, 0, 0, 0, 0, 12236, 0, 0, 0, 0}, new long[] {1, 11, 12, 23, 265, 12213, 134608, 146821, 281429, 3242540});
  }
}

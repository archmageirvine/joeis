package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042859 Denominators of continued fraction convergents to <code>sqrt(960)</code>.
 * @author Sean A. Irvine
 */
public class A042859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042859() {
    super(new long[] {-1, 0, 62, 0}, new long[] {1, 1, 61, 62});
  }
}

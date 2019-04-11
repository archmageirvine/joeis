package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042301 Denominators of continued fraction convergents to <code>sqrt(677)</code>.
 * @author Sean A. Irvine
 */
public class A042301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042301() {
    super(new long[] {1, 52}, new long[] {1, 52});
  }
}

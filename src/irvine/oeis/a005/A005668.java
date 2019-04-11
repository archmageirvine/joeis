package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005668 Denominators of continued fraction convergents to <code>sqrt(10)</code>.
 * @author Sean A. Irvine
 */
public class A005668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005668() {
    super(new long[] {1, 6}, new long[] {0, 1});
  }
}


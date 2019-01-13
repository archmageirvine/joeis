package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182077.
 * @author Sean A. Irvine
 */
public class A182077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182077() {
    super(new long[] {4, -13, 3, 15, 3}, new long[] {13, 76, 435, 2461, 13971});
  }
}

package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121203.
 * @author Sean A. Irvine
 */
public class A121203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121203() {
    super(new long[] {-35, 82, -60, 14}, new long[] {0, 4, 28, 224});
  }
}

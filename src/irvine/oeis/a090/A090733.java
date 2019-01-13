package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090733.
 * @author Sean A. Irvine
 */
public class A090733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090733() {
    super(new long[] {-1, 25}, new long[] {2, 25});
  }
}

package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225829.
 * @author Sean A. Irvine
 */
public class A225829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225829() {
    super(new long[] {8192, -1280, -224, 40}, new long[] {1, 20, 288, 8640});
  }
}

package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155923.
 * @author Sean A. Irvine
 */
public class A155923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155923() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {13, 17, 25, 53, 85, 137});
  }
}

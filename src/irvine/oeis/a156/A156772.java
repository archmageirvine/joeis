package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156772 729n - 198.
 * @author Sean A. Irvine
 */
public class A156772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156772() {
    super(new long[] {-1, 2}, new long[] {531, 1260});
  }
}

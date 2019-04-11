package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156771 <code>729n - 531</code>.
 * @author Sean A. Irvine
 */
public class A156771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156771() {
    super(new long[] {-1, 2}, new long[] {198, 927});
  }
}

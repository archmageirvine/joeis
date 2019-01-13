package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025951.
 * @author Sean A. Irvine
 */
public class A025951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025951() {
    super(new long[] {-576, 600, -202, 25}, new long[] {1, 25, 423, 6125});
  }
}

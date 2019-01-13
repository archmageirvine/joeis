package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288835.
 * @author Sean A. Irvine
 */
public class A288835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288835() {
    super(new long[] {27, -27, 9}, new long[] {6, 45, 243});
  }
}

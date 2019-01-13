package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060851.
 * @author Sean A. Irvine
 */
public class A060851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060851() {
    super(new long[] {-81, 18}, new long[] {3, 81});
  }
}

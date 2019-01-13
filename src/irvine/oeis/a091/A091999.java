package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091999.
 * @author Sean A. Irvine
 */
public class A091999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091999() {
    super(new long[] {-1, 1, 1}, new long[] {2, 10, 14});
  }
}

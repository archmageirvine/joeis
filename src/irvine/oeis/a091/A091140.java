package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091140.
 * @author Sean A. Irvine
 */
public class A091140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091140() {
    super(new long[] {-2, 4, 2}, new long[] {1, 3, 9});
  }
}

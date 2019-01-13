package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253446.
 * @author Sean A. Irvine
 */
public class A253446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253446() {
    super(new long[] {1, -31, 31}, new long[] {1, 16, 465});
  }
}

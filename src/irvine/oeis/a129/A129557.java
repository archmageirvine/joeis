package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129557.
 * @author Sean A. Irvine
 */
public class A129557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129557() {
    super(new long[] {-1, 0, 38, 0}, new long[] {1, 4, 34, 151});
  }
}

package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133034 First differences of Padovan sequence <code>A000931</code>.
 * @author Sean A. Irvine
 */
public class A133034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133034() {
    super(new long[] {1, 1, 0}, new long[] {-1, 0, 1});
  }
}

package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199022 <code>5*11^n-1</code>.
 * @author Sean A. Irvine
 */
public class A199022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199022() {
    super(new long[] {-11, 12}, new long[] {4, 54});
  }
}

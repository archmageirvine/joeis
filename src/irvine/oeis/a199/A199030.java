package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199030 <code>10*11^n-1</code>.
 * @author Sean A. Irvine
 */
public class A199030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199030() {
    super(new long[] {-11, 12}, new long[] {9, 109});
  }
}

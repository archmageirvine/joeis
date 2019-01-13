package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129007.
 * @author Sean A. Irvine
 */
public class A129007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129007() {
    super(new long[] {-2401, 1372, -294, 28}, new long[] {14, 588, 12348, 192080});
  }
}

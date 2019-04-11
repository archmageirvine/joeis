package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155593 <code>9^n+2^n-1</code>.
 * @author Sean A. Irvine
 */
public class A155593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155593() {
    super(new long[] {18, -29, 12}, new long[] {1, 10, 84});
  }
}

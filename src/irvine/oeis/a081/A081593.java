package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081593 Third row of <code>Pascal-(1,7,1)</code> array <code>A081582</code>.
 * @author Sean A. Irvine
 */
public class A081593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081593() {
    super(new long[] {1, -3, 3}, new long[] {1, 17, 97});
  }
}

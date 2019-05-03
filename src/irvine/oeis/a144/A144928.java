package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144928 Values of k arising in <code>A144927</code>.
 * @author Sean A. Irvine
 */
public class A144928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144928() {
    super(new long[] {-1, 110}, new long[] {49, 5341});
  }
}

package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213829 Principal diagonal of the convolution array <code>A213828</code>.
 * @author Sean A. Irvine
 */
public class A213829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213829() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 28, 114, 296});
  }
}

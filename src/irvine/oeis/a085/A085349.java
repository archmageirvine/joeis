package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085349 Ratio-determined insertion sequence <code>I(0.26688) (see</code> the link <code>below)</code>.
 * @author Sean A. Irvine
 */
public class A085349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085349() {
    super(new long[] {-1, 0, 18, 0}, new long[] {1, 4, 15, 71});
  }
}

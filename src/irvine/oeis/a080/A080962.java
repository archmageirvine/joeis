package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080962 5th binomial transform of the periodic sequence <code>(1,6,1,1,6,1</code>...).
 * @author Sean A. Irvine
 */
public class A080962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080962() {
    super(new long[] {-24, 10}, new long[] {1, 11});
  }
}

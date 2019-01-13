package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016961.
 * @author Sean A. Irvine
 */
public class A016961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016961() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1024, 100000, 1048576, 5153632, 17210368, 45435424});
  }
}

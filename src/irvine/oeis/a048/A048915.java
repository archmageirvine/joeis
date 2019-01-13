package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048915.
 * @author Sean A. Irvine
 */
public class A048915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048915() {
    super(new long[] {1, -1, -146361602, 146361602, 1}, new long[] {1, 651, 180868051, 95317119801L, 26472137730696901L});
  }
}

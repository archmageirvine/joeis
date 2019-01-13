package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101427.
 * @author Sean A. Irvine
 */
public class A101427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101427() {
    super(new long[] {1, -2, -1, 3, 1, -1, -3, 1, 2}, new long[] {1, 2, 8, 19, 42, 78, 139, 224, 350});
  }
}

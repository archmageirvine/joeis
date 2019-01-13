package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253823.
 * @author Sean A. Irvine
 */
public class A253823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253823() {
    super(new long[] {1, -1, -1331714, 1331714, 1}, new long[] {1, 97921, 1039585, 130402572385L, 1384429704481L});
  }
}

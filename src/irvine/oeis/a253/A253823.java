package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253823 Octagonal numbers (A000567) which are also centered triangular numbers (A005448).
 * @author Sean A. Irvine
 */
public class A253823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253823() {
    super(1, new long[] {1, -1, -1331714, 1331714, 1}, new long[] {1, 97921, 1039585, 130402572385L, 1384429704481L});
  }
}

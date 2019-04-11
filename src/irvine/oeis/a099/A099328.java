package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099328 Number of Catalan knight paths from <code>(0,0)</code> to <code>(n,0)</code> in the region between and on the lines y=0 and y=3. (See A096587 for the definition of Catalan knight.).
 * @author Sean A. Irvine
 */
public class A099328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099328() {
    super(new long[] {-1, 1, 1, 3, -1, 1, 1}, new long[] {1, 0, 1, 0, 2, 2, 8});
  }
}

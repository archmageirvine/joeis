package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244875 Number of magic labelings with magic sum n of 7th graph shown in link.
 * @author Sean A. Irvine
 */
public class A244875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244875() {
    super(new long[] {-1, 7, -20, 28, -14, -14, 28, -20, 7}, new long[] {1, 21, 179, 938, 3612, 11242, 29947, 70855, 152720});
  }
}

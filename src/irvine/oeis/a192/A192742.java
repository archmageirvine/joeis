package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192742 Number of matchings in the n-antiprism graph.
 * @author Sean A. Irvine
 */
public class A192742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192742() {
    super(new long[] {-1, -1, 3, 3}, new long[] {3, 15, 51, 191});
  }
}

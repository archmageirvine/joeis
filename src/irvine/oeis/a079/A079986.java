package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079986.
 * @author Sean A. Irvine
 */
public class A079986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079986() {
    super(new long[] {-1, 0, 0, 0, -1, 0, 6, 0, 3, 0, 2, 0}, new long[] {1, 0, 1, 0, 4, 0, 16, 0, 49, 0, 169, 0});
  }
}

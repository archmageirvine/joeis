package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162330 Blocks of 4 numbers of the form 2k, 2k-1, 2k, 2k+1, k=1,2,3,4,...
 * @author Sean A. Irvine
 */
public class A162330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162330() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 1, 2, 3, 4});
  }
}

package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032527 Concentric pentagonal numbers: floor( 5*n^2 / 4 ).
 * @author Sean A. Irvine
 */
public class A032527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032527() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 5, 11});
  }
}

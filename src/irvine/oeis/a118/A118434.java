package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118434 Row sums of self-inverse triangle A118433.
 * @author Sean A. Irvine
 */
public class A118434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118434() {
    super(new long[] {-4, 0, 0, 0}, new long[] {1, 0, 2, 4});
  }
}

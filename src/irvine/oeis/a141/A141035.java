package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141035 Period <code>10</code>: repeat <code>0, 0, 4, 2, -2, 4, 2, -4, -4, -2</code>.
 * @author Sean A. Irvine
 */
public class A141035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141035() {
    super(new long[] {-1, 0, -1, 0, -1, 0, -1, 0}, new long[] {0, 0, 4, 2, -2, 4, 2, -4});
  }
}

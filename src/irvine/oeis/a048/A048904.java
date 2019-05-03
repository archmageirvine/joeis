package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048904 Indices of heptagonal numbers <code>(A000566)</code> which are also octagonal.
 * @author Sean A. Irvine
 */
public class A048904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048904() {
    super(new long[] {1, -483, 483}, new long[] {1, 345, 166145});
  }
}

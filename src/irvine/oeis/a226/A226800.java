package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226800.
 * @author Sean A. Irvine
 */
public class A226800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226800() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {541, 2612, 7803, 18424, 37625, 69516});
  }
}

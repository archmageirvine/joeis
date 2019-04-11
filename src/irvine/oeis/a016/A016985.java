package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016985 <code>a(n) = (7n)^5</code>.
 * @author Sean A. Irvine
 */
public class A016985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016985() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 16807, 537824, 4084101, 17210368, 52521875});
  }
}

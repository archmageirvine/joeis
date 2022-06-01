package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121485 Number of nondecreasing Dyck paths of semilength n and having no peaks at even level (n&gt;=0). A nondecreasing Dyck path is a Dyck path for which the sequence of the altitudes of the valleys is nondecreasing.
 * @author Sean A. Irvine
 */
public class A121485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121485() {
    super(new long[] {1, 0, -4, -2, 4, 1}, new long[] {1, 1, 2, 4, 8, 16});
  }
}

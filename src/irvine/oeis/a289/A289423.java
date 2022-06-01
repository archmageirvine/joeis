package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289423 Number of Dyck paths of semilength n and height exactly 10.
 * @author Sean A. Irvine
 */
public class A289423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289423() {
    super(new long[] {-6, 125, -791, 2269, -3544, 3300, -1912, 695, -154, 19}, new long[] {1, 19, 207, 1702, 11753, 72036, 404984, 2133296, 10683684, 51401251});
  }
}

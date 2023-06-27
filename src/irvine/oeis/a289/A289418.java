package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289418 Number of Dyck paths of semilength n and height exactly 5.
 * @author Sean A. Irvine
 */
public class A289418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289418() {
    super(5, new long[] {3, -22, 40, -29, 9}, new long[] {1, 9, 52, 247, 1053});
  }
}

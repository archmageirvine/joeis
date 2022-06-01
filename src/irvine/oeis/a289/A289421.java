package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289421 Number of Dyck paths of semilength n and height exactly 8.
 * @author Sean A. Irvine
 */
public class A289421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289421() {
    super(new long[] {-5, 70, -296, 553, -541, 297, -92, 15}, new long[] {1, 15, 133, 912, 5358, 28405, 140049, 654588});
  }
}

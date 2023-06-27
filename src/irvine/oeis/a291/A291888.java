package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291888 Number of symmetrically unique Dyck paths of semilength n and height four.
 * @author Sean A. Irvine
 */
public class A291888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291888() {
    super(4, new long[] {-9, 30, 3, -76, 66, -2, -19, 8}, new long[] {1, 4, 19, 69, 252, 855, 2867, 9339});
  }
}

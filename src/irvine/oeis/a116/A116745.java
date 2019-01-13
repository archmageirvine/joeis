package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116745.
 * @author Sean A. Irvine
 */
public class A116745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116745() {
    super(new long[] {16, -112, 344, -608, 681, -501, 242, -74, 13}, new long[] {1, 2, 6, 21, 74, 246, 763, 2227, 6191});
  }
}

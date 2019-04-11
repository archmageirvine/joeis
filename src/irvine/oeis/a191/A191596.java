package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191596 Expansion of <code>(1+x)^4/(1-x)^7</code>.
 * @author Sean A. Irvine
 */
public class A191596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191596() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 11, 62, 242, 743, 1925, 4396});
  }
}

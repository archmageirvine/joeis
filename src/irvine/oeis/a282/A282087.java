package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282087 Number of length-n ternary strings that do not contain both <code>"00"</code> and <code>"11"</code>.
 * @author Sean A. Irvine
 */
public class A282087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282087() {
    super(new long[] {-2, -6, -1, 4}, new long[] {1, 3, 9, 27});
  }
}

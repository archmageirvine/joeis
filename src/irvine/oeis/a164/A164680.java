package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164680 Expansion of x/((1-x)^3*(1-x^2)^3*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A164680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164680() {
    super(new long[] {1, -3, 0, 7, -3, -6, 0, 6, 3, -7, 0, 3}, new long[] {1, 3, 9, 20, 42, 78, 139, 231, 372, 573, 861, 1254});
  }
}

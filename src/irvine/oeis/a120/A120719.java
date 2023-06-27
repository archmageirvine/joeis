package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120719 Expansion of -2*x^2*(60*x^3-315*x^2-727*x+305)/((x-1)*(x^2-7*x+1)*(x^2+3*x+1)).
 * @author Sean A. Irvine
 */
public class A120719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120719() {
    super(1, new long[] {1, -5, -15, 15, 5}, new long[] {0, 610, 1596, 16500, 97410});
  }
}

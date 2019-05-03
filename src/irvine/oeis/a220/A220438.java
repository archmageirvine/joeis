package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220438 <code>a(n) = A220437(n)/2</code>.
 * @author Sean A. Irvine
 */
public class A220438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220438() {
    super(new long[] {1, -5, -35, 67, 145, -145, -67, 35, 5}, new long[] {3, 14, 170, 1152, 10326, 78963, 656624, 5213426, 42439104});
  }
}

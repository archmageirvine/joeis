package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237250 Values of x in the solutions to x^2 - 4xy + y^2 + 11 = 0, where 0 &lt; x &lt; y.
 * @author Sean A. Irvine
 */
public class A237250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237250() {
    super(new long[] {-1, 0, 4, 0}, new long[] {2, 3, 5, 10});
  }
}

package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083296 a(n) = (4*3^n + (-7)^n)/5.
 * @author Sean A. Irvine
 */
public class A083296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083296() {
    super(new long[] {21, -4}, new long[] {1, 1});
  }
}

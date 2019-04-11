package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104005 <code>a(n+3) = a(n+2) + 3a(n+1) - 2a(n)</code>; <code>a(0) = 1, a(1) = -1, a(2)= 3</code>.
 * @author Sean A. Irvine
 */
public class A104005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104005() {
    super(new long[] {-2, 3, 1}, new long[] {1, -1, 3});
  }
}

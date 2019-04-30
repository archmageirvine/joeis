package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071954 <code>a(n) = 4*a(n-1) - a(n-2) - 4</code>, with <code>a(0) = 2, a(1) = 4</code>.
 * @author Sean A. Irvine
 */
public class A071954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071954() {
    super(new long[] {1, -5, 5}, new long[] {2, 4, 10});
  }
}

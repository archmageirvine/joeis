package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090730 <code>a(n) = 22a(n-1) - a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 22</code>.
 * @author Sean A. Irvine
 */
public class A090730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090730() {
    super(new long[] {-1, 22}, new long[] {2, 22});
  }
}

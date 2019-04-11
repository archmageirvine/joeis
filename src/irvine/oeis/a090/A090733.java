package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090733 <code>a(n) = 25*a(n-1) - a(n-2),</code> starting with <code>a(0) = 2</code> and <code>a(1) = 25</code>.
 * @author Sean A. Irvine
 */
public class A090733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090733() {
    super(new long[] {-1, 25}, new long[] {2, 25});
  }
}

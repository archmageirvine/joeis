package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090249 <code>a(n) = 28a(n-1) - a(n-2),</code> starting with <code>a(0) = 2</code> and <code>a(1) = 28</code>.
 * @author Sean A. Irvine
 */
public class A090249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090249() {
    super(new long[] {-1, 28}, new long[] {2, 28});
  }
}

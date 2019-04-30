package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090307 <code>a(n) = 18a(n-1) + a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 18</code>.
 * @author Sean A. Irvine
 */
public class A090307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090307() {
    super(new long[] {1, 18}, new long[] {2, 18});
  }
}

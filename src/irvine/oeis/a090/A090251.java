package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090251 <code>a(n) =29a(n-1) - a(n-2),</code> starting with <code>a(0) = 2</code> and <code>a(1) = 29</code>.
 * @author Sean A. Irvine
 */
public class A090251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090251() {
    super(new long[] {-1, 29}, new long[] {2, 29});
  }
}

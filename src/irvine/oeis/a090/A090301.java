package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090301 <code>a(n) = 15a(n-1) + a(n-2),</code> starting with <code>a(0) = 2</code> and <code>a(1) = 15</code>.
 * @author Sean A. Irvine
 */
public class A090301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090301() {
    super(new long[] {1, 15}, new long[] {2, 15});
  }
}

package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027469 <code>a(n) = 49*(n-1)*(n-2)/2</code>.
 * @author Sean A. Irvine
 */
public class A027469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027469() {
    super(new long[] {1, -3, 3}, new long[] {49, 147, 294});
  }
}

package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022409 <code>a(n) = a(n-1) + a(n-2) + 1</code>, with <code>a(0)=3, a(1)=10</code>.
 * @author Sean A. Irvine
 */
public class A022409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022409() {
    super(new long[] {-1, 0, 2}, new long[] {3, 10, 14});
  }
}

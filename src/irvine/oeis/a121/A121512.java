package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121512 a(n) = a(n-1) + a(n-3) - a(n-4) for n&gt;4, with a(1)=1, a(2)=4, a(3)=10, a(4)=4.
 * @author Sean A. Irvine
 */
public class A121512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121512() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 4, 10, 4});
  }
}

package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118554 a(n) = 6*a(n-5) - a(n-10) + 98 with a(0)=0, a(1)=11, a(2)=35, a(3)=56, a(4)=104, a(5)=147, a(6)=204, a(7)=336, a(8)=455, a(9)=731.
 * @author Sean A. Irvine
 */
public class A118554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118554() {
    super(new long[] {1, -1, 0, 0, 0, -6, 6, 0, 0, 0, 1}, new long[] {0, 11, 35, 56, 104, 147, 204, 336, 455, 731, 980});
  }
}

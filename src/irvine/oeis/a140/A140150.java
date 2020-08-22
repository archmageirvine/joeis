package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140150 a(1)=1, a(n)=a(n-1)+n^2 if n odd, a(n)=a(n-1)+ n^4 if n is even.
 * @author Sean A. Irvine
 */
public class A140150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140150() {
    super(new long[] {-1, 1, 5, -5, -10, 10, 10, -10, -5, 5, 1}, new long[] {1, 17, 26, 282, 307, 1603, 1652, 5748, 5829, 15829, 15950});
  }
}

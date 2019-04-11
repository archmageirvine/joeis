package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237988 <code>a(n) = 3*a(n-3) + 3*a(n-6) + a(n-9)</code> for <code>n&gt;8, a(0)=0, a(1)=a(2)=1, a(3)=a(4)=2, a(5)=3, a(6)=7, a(7)=9, a(8)=11</code>.
 * @author Sean A. Irvine
 */
public class A237988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237988() {
    super(new long[] {1, 0, 0, 3, 0, 0, 3, 0, 0}, new long[] {0, 1, 1, 2, 2, 3, 7, 9, 11});
  }
}

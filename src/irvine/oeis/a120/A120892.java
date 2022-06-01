package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120892 a(n)=3*a(n-1)+3*a(n-2)-a(n-3);a(0)=1,a(1)=0,a(2)=3. a(n)=4*{a(n-1)+(-1)^n}-a(n-2);a(0)=1,a(1)=0.
 * @author Sean A. Irvine
 */
public class A120892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120892() {
    super(new long[] {-1, 3, 3}, new long[] {1, 0, 3});
  }
}

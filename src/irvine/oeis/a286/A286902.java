package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286902 a(1)=1, a(2)=2, a(3)=3, a(4)=4, a(5)=5, a(n)=5*a(n-5)+4*a(n-4)+3*a(n-3)+2*a(n-2)+a(n-1).
 * @author Sean A. Irvine
 */
public class A286902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286902() {
    super(new long[] {5, 4, 3, 2, 1}, new long[] {1, 2, 3, 4, 5});
  }
}

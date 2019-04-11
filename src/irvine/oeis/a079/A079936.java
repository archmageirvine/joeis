package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079936 Greedy frac multiples of <code>sqrt(5)</code>: <code>a(1)=1,</code> sum(n&gt;0,frac(a(n)*x))=1 at <code>x=sqrt(5)</code>.
 * @author Sean A. Irvine
 */
public class A079936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079936() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 322, 0, 0, 0, 0, 0}, new long[] {1, 2, 5, 13, 17, 34, 305, 610, 1597, 4181, 5473, 10946});
  }
}

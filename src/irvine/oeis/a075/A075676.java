package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075676 a(n)=(1/2)(-(-1)^n+1)T(n)+(1/2)((-1)^n+1)S(n), where T(n)=tribonacci numbers A000073, S(n)=generalized tribonacci numbers A001644.
 * @author Sean A. Irvine
 */
public class A075676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075676() {
    super(new long[] {1, 0, 1, 0, 3, 0}, new long[] {3, 1, 3, 2, 11, 7});
  }
}

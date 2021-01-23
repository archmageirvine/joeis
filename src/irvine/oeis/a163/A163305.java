package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163305 Numerators of fractions in the approximation of the square root of 5 satisfying: a(n)= (a(n-1)+ c)/(a(n-1)+1); with c=5 and a(1)=0. Also product of the powers of two and five times the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A163305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163305() {
    super(new long[] {4, 2}, new long[] {0, 5});
  }
}

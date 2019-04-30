package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081704 Let <code>f(0)=1</code>, f(1)=t, <code>f(n+1) =</code> (f(n)^2+t^n)/f(n-1). f(t) is a polynomial with integer coefficients. Then <code>a(n) = f(n)</code> when t=3.
 * @author Sean A. Irvine
 */
public class A081704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081704() {
    super(new long[] {-3, 5}, new long[] {1, 3});
  }
}

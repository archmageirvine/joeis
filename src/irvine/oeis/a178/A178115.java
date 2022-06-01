package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178115 a(n)=(-1)^C(n+1,2)*(F(n+1)*(1+(-1)^n)/2+F(n+2)*(1-(-1)^n)/2).
 * @author Sean A. Irvine
 */
public class A178115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178115() {
    super(new long[] {-1, 0, -3, 0}, new long[] {1, -2, -2, 5});
  }
}

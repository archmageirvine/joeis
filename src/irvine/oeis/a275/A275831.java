package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275831 <code>a(n) = (sqrt(7)*csc(Pi/7)/2)^n + (-sqrt(7)*csc(2*Pi/7)/2)^n + (-sqrt(7)*csc(4*Pi/7)/2)^n</code>.
 * @author Sean A. Irvine
 */
public class A275831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275831() {
    super(new long[] {7, 7, 0}, new long[] {3, 0, 14});
  }
}

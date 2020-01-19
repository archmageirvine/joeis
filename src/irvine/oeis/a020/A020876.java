package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020876 <code>a(n) = ((5+sqrt(5))/2)^n + ((5-sqrt(5))/2)^n</code>.
 * @author Sean A. Irvine
 */
public class A020876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020876() {
    super(new long[] {-5, 5}, new long[] {2, 5});
  }
}

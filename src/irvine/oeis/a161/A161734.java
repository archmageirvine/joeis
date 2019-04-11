package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161734 <code>a(n) = ((2+sqrt(2))*(5+sqrt(2))^n+(2-sqrt(2))*(5-sqrt(2))^n)/4</code>.
 * @author Sean A. Irvine
 */
public class A161734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161734() {
    super(new long[] {-23, 10}, new long[] {1, 6});
  }
}

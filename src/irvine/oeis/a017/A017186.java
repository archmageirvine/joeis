package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017186 <code>a(n) = (9*n + 2)^2</code>.
 * @author Sean A. Irvine
 */
public class A017186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017186() {
    super(new long[] {1, -3, 3}, new long[] {4, 121, 400});
  }
}

package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017271 <code>a(n) = (10*n)^3</code>.
 * @author Sean A. Irvine
 */
public class A017271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017271() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1000, 8000, 27000});
  }
}

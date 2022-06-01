package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176384 y-values in the solution to x^2-73*y^2=1.
 * @author Sean A. Irvine
 */
public class A176384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176384() {
    super(new long[] {-1, 4562498}, new long[] {0, 267000});
  }
}

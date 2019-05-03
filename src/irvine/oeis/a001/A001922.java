package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001922 Numbers n such that <code>3*n^2-3*n+1</code> is both a square <code>(A000290)</code> and a centered hexagonal number <code>(A003215)</code>.
 * @author Sean A. Irvine
 */
public class A001922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001922() {
    super(new long[] {1, -15, 15}, new long[] {1, 8, 105});
  }
}

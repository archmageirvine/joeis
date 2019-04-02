package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132434 a(n) = A132433(n) - 33.
 * @author Sean A. Irvine
 */
public class A132434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132434() {
    super(new long[] {-8, 9}, new long[] {104, 1064});
  }
}

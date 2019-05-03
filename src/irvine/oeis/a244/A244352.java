package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244352 <code>Pell(n)^3 - Pell(n)^2</code>, where <code>Pell(n)</code> is the n-th Pell number <code>(A000129)</code>.
 * @author Sean A. Irvine
 */
public class A244352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244352() {
    super(new long[] {-1, -7, 95, -79, -223, -25, 17}, new long[] {0, 0, 4, 100, 1584, 23548, 338100});
  }
}

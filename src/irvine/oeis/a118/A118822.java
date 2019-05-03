package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118822 Numerators of the convergents of the 2-adic continued fraction of zero given by <code>A118821</code>.
 * @author Sean A. Irvine
 */
public class A118822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118822() {
    super(new long[] {-1, 0, 0, 0}, new long[] {2, -1, 0, -1});
  }
}

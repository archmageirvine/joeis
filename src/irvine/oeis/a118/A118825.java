package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118825 Numerators of the convergents of the 2-adic continued fraction of zero given by <code>A118824</code>.
 * @author Sean A. Irvine
 */
public class A118825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118825() {
    super(new long[] {-1, 0, 0, 0}, new long[] {-2, -1, 0, -1});
  }
}

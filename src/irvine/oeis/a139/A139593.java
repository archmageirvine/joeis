package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139593 <code>A139276(n)</code> followed by <code>A139272(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A139593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139593() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 11, 22});
  }
}

package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092165 Let M <code>= 2 X 2</code> matrix <code>[ 1 2 / 5 4 ]; a(n) = (1,2)</code> entry of <code>M^n</code>.
 * @author Sean A. Irvine
 */
public class A092165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092165() {
    super(new long[] {6, 5}, new long[] {2, 10});
  }
}

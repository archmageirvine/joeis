package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092166 Let M <code>= 2 X 2</code> matrix <code>[ 1 2 / 5 4 ]; a(n) = (2,1)</code> entry of <code>M^n</code>.
 * @author Sean A. Irvine
 */
public class A092166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092166() {
    super(new long[] {6, 5}, new long[] {5, 25});
  }
}

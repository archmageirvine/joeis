package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092166 Let M <code>= 2</code> X 2 matrix <code>[ 1 2 / 5 4 ]; a(n) = (2,1)</code> entry of M^n.
 * @author Sean A. Irvine
 */
public class A092166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092166() {
    super(new long[] {6, 5}, new long[] {5, 25});
  }
}

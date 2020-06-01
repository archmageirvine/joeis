package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094726 Let M = the <code>2 X 2</code> matrix <code>[ 0 3 / 3 2]</code>. Take <code>(M^n * [1 1])/3 = [p q];</code> then <code>a(n) =</code> p.
 * @author Sean A. Irvine
 */
public class A094726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094726() {
    super(new long[] {9, 2}, new long[] {1, 5});
  }
}

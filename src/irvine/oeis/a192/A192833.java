package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192833 Molecular topological indices of the Moebius ladders.
 * @author Sean A. Irvine
 */
public class A192833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192833() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {24, 72, 180, 336, 600, 936});
  }
}

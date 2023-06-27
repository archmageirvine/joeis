package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253715 Indices of centered heptagonal numbers (A069099) which are also hexagonal numbers (A000384).
 * @author Sean A. Irvine
 */
public class A253715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253715() {
    super(1, new long[] {1, -1, -64514, 64514, 1}, new long[] {1, 2160, 34417, 139317984, 2220346081L});
  }
}

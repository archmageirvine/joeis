package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253715 Indices of centered heptagonal numbers <code>(A069099)</code> which are also hexagonal numbers <code>(A000384)</code>.
 * @author Sean A. Irvine
 */
public class A253715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253715() {
    super(new long[] {1, -1, -64514, 64514, 1}, new long[] {1, 2160, 34417, 139317984, 2220346081L});
  }
}

package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276916 Subsequence of centered square numbers obtained by adding four triangles from <code>A276914</code> and a central element, <code>a(n) = 4*A276914(n) + 1</code>.
 * @author Sean A. Irvine
 */
public class A276916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276916() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 5, 41, 61, 145});
  }
}

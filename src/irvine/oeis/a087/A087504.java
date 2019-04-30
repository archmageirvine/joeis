package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087504 Composition length of the n-th symmetric power of the natural representation of a finite subgroup of <code>SL(2</code>,C) of type E_7 (binary octahedral group).
 * @author Sean A. Irvine
 */
public class A087504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087504() {
    super(new long[] {-1, 1, 0, -1, 2, -1, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 3, 3});
  }
}

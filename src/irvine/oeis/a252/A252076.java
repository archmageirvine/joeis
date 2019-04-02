package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252076 Numbers n such that the sum of the heptagonal numbers H(n) and H(n+1) is equal to the hexagonal number X(m) for some m.
 * @author Sean A. Irvine
 */
public class A252076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252076() {
    super(new long[] {1, -1443, 1443}, new long[] {0, 486, 701100});
  }
}

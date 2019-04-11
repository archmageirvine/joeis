package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017175 <code>a(n) = (9*n + 1)^3</code>.
 * @author Sean A. Irvine
 */
public class A017175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017175() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 1000, 6859, 21952});
  }
}

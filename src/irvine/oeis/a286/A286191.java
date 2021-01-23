package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286191 a(n) = (2^n-1)^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A286191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286191() {
    super(new long[] {-8, 22, -21, 8}, new long[] {3, 13, 55, 233});
  }
}

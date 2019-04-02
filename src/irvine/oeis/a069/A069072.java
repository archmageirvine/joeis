package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069072 a(n) = (2n+1)*(2n+2)*(2n+3).
 * @author Sean A. Irvine
 */
public class A069072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069072() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 60, 210, 504});
  }
}

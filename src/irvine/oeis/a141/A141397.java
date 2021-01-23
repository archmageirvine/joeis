package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141397 a(n) = 3*a(n-1) + A001651(n+1).
 * @author Sean A. Irvine
 */
public class A141397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141397() {
    super(new long[] {3, -4, -2, 4}, new long[] {1, 5, 19, 62});
  }
}

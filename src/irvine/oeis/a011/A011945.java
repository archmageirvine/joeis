package irvine.oeis.a011;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A011945 Areas of almost-equilateral Heronian triangles (integral side lengths m-1, m, m+1 and integral area).
 * @author Sean A. Irvine
 */
public class A011945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011945() {
    super(new long[] {-1, 14}, new long[] {0, 6});
  }
}

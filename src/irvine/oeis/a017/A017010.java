package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017010 a(n) = (7*n+2)^6.
 * @author Sean A. Irvine
 */
public class A017010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017010() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {64, 531441, 16777216, 148035889, 729000000, 2565726409L, 7256313856L});
  }
}

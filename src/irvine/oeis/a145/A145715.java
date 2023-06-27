package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145715 Numbers X such that there exists Y in N with X^2 = 381*Y^2 + 127.
 * @author Sean A. Irvine
 */
public class A145715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145715() {
    super(1, new long[] {-1, 2030}, new long[] {254, 515366});
  }
}

package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145715 Numbers X such that there exists Y in N with X^2 = 381*Y^2 <code>+ 127</code>.
 * @author Sean A. Irvine
 */
public class A145715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145715() {
    super(new long[] {-1, 2030}, new long[] {254, 515366});
  }
}

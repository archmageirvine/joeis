package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253680 Numbers c(n) whose square are equal to the sum of <code>an</code> odd number M of consecutive cubed integers b^3 + (b+1)^3 <code>+ </code>... + (b+M-1)^3 = c(n)^2, starting at b(n) (A253679).
 * @author Sean A. Irvine
 */
public class A253680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253680() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {204, 2940, 16296, 57960, 159060, 368004});
  }
}

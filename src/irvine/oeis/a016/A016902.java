package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016902 <code>a(n) = (5*n + 4)^6</code>.
 * @author Sean A. Irvine
 */
public class A016902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016902() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {4096, 531441, 7529536, 47045881, 191102976, 594823321, 1544804416});
  }
}

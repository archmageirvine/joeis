package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253708 Numbers c(n) whose squares are equal to the sums of consecutive cubed integers b^3 + (b+1)^3 + ... + (b+M-1)^3 = c^2, for a first term b(n) being an odd squared integer (A016754).
 * @author Sean A. Irvine
 */
public class A253708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253708() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {323, 7497, 57618, 262430, 878445, 2399103, 5669972});
  }
}

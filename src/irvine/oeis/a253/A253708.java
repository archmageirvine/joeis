package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253708 Numbers <code>c(n)</code> whose squares are equal to the sums of consecutive cubed integers <code>b^3 + (b+1)^3 +</code> ... <code>+ (b+M-1)^3 = c^2</code>, for a first term <code>b(n)</code> being an odd squared integer <code>(A016754)</code>.
 * @author Sean A. Irvine
 */
public class A253708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253708() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {323, 7497, 57618, 262430, 878445, 2399103, 5669972});
  }
}

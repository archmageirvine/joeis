package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253707 Numbers <code>M(n)</code> which are the number of terms in the sums of consecutive cubed integers equaling a squared integer, <code>b^3 + (b+1)^3 + ... + (b+M-1)^3 = c^2</code>, for a first term <code>b(n)</code> being an odd squared integer <code>(A016754)</code>.
 * @author Sean A. Irvine
 */
public class A253707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253707() {
    super(new long[] {-1, 4, -6, 4}, new long[] {17, 98, 291, 644});
  }
}

package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016915 a(n) = (6*n)^7.
 * @author Sean A. Irvine
 */
public class A016915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016915() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 279936, 35831808, 612220032, 4586471424L, 21870000000L, 78364164096L, 230539333248L});
  }
}

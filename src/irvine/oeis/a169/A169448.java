package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169448 Number of reduced words of length n in Coxeter group on 3 generators S_i with relations (S_i)^2 = (S_i S_j)^33 = I.
 * @author Sean A. Irvine
 */
public class A169448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169448() {
    super(new long[] {-1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2}, new long[] {1, 3, 6, 12, 24, 48, 96, 192, 384, 768, 1536, 3072, 6144, 12288, 24576, 49152, 98304, 196608, 393216, 786432, 1572864, 3145728, 6291456, 12582912, 25165824, 50331648, 100663296, 201326592, 402653184, 805306368, 1610612736, 3221225472L});
  }
}

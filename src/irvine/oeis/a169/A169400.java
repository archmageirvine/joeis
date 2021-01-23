package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169400 Number of reduced words of length n in Coxeter group on 3 generators S_i with relations (S_i)^2 = (S_i S_j)^32 = I.
 * @author Sean A. Irvine
 */
public class A169400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169400() {
    super(new long[] {-1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {3, 6, 12, 24, 48, 96, 192, 384, 768, 1536, 3072, 6144, 12288, 24576, 49152, 98304, 196608, 393216, 786432, 1572864, 3145728, 6291456, 12582912, 25165824, 50331648, 100663296, 201326592, 402653184, 805306368, 1610612736, 3221225472L, 6442450941L}, 1);
  }
}

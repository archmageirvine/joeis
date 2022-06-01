package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016752 a(n) = (2*n)^12.
 * @author Sean A. Irvine
 */
public class A016752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016752() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 4096, 16777216, 2176782336L, 68719476736L, 1000000000000L, 8916100448256L, 56693912375296L, 281474976710656L, 1156831381426176L, 4096000000000000L, 12855002631049216L, 36520347436056576L});
  }
}

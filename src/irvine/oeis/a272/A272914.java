package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272914 Sixth powers ending in digit 6.
 * @author Sean A. Irvine
 */
public class A272914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272914() {
    super(1, new long[] {1, -1, -6, 6, 15, -15, -20, 20, 15, -15, -6, 6, 1}, new long[] {4096, 46656, 7529536, 16777216, 191102976, 308915776, 1544804416, 2176782336L, 7256313856L, 9474296896L, 24794911296L, 30840979456L, 68719476736L});
  }
}

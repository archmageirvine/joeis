package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017322 <code>a(n) = (10*n + 4)^6</code>.
 * @author Sean A. Irvine
 */
public class A017322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017322() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {4096, 7529536, 191102976, 1544804416, 7256313856L, 24794911296L, 68719476736L});
  }
}

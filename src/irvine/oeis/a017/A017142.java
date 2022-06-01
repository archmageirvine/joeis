package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017142 a(n) = (8*n+6)^6.
 * @author Sean A. Irvine
 */
public class A017142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017142() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {46656, 7529536, 113379904, 729000000, 3010936384L, 9474296896L, 24794911296L});
  }
}

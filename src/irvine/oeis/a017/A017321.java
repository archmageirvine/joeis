package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017321 a(n) = (10*n + 4)^5.
 * @author Sean A. Irvine
 */
public class A017321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017321() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1024, 537824, 7962624, 45435424, 164916224, 459165024});
  }
}

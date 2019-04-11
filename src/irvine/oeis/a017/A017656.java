package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017656 <code>(12n+11)^4</code>.
 * @author Sean A. Irvine
 */
public class A017656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017656() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {14641, 279841, 1500625, 4879681, 12117361});
  }
}

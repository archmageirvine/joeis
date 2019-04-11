package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017633 <code>(12n+9)^5</code>.
 * @author Sean A. Irvine
 */
public class A017633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017633() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {59049, 4084101, 39135393, 184528125, 601692057, 1564031349});
  }
}

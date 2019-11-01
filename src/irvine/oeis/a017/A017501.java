package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017501 <code>a(n) = (11*n + 9)^5</code>.
 * @author Sean A. Irvine
 */
public class A017501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017501() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {59049, 3200000, 28629151, 130691232, 418195493, 1073741824});
  }
}

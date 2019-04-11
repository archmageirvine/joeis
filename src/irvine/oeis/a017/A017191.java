package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017191 <code>a(n) = (9*n + 2)^7</code>.
 * @author Sean A. Irvine
 */
public class A017191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017191() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {128, 19487171, 1280000000, 17249876309L, 114415582592L, 506623120463L, 1727094849536L, 4902227890625L});
  }
}

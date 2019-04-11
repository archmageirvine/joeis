package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017586 <code>(12n+5)^6</code>.
 * @author Sean A. Irvine
 */
public class A017586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017586() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {15625, 24137569, 594823321, 4750104241L, 22164361129L, 75418890625L, 208422380089L});
  }
}

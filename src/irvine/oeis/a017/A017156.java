package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017156 a(n) = (8*n + 7)^8.
 * @author Sean A. Irvine
 */
public class A017156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017156() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {5764801, 2562890625L, 78310985281L, 852891037441L, 5352009260481L, 23811286661761L, 83733937890625L, 248155780267521L, 645753531245761L});
  }
}

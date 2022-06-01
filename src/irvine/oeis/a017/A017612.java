package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017612 (12n+7)^8.
 * @author Sean A. Irvine
 */
public class A017612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017612() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {5764801, 16983563041L, 852891037441L, 11688200277601L, 83733937890625L, 406067677556641L, 1517108809906561L, 4702525276151521L, 12667700813876161L});
  }
}

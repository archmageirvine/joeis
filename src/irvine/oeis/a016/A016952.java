package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016952 a(n) = (6*n + 3)^8.
 * @author Sean A. Irvine
 */
public class A016952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016952() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {6561, 43046721, 2562890625L, 37822859361L, 282429536481L, 1406408618241L, 5352009260481L, 16815125390625L, 45767944570401L});
  }
}

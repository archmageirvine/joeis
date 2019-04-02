package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016976 a(n) = (6*n + 5)^8.
 * @author Sean A. Irvine
 */
public class A016976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016976() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {390625, 214358881, 6975757441L, 78310985281L, 500246412961L, 2251875390625L, 7984925229121L, 23811286661761L, 62259690411361L});
  }
}

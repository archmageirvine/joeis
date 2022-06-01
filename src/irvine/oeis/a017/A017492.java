package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017492 a(n) = (11*n + 8)^8.
 * @author Sean A. Irvine
 */
public class A017492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017492() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {16777216, 16983563041L, 656100000000L, 7984925229121L, 53459728531456L, 248155780267521L, 899194740203776L, 2724905250390625L, 7213895789838336L});
  }
}

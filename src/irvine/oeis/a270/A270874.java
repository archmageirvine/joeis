package irvine.oeis.a270;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270874 a(n) = n^10 + 9*n^9 + 53*n^8 + 218*n^7 + 695*n^6 + 1754*n^5 + 3572*n^4 + 5854*n^3 + 7510*n^2 + 6559*n + 34.
 * @author Sean A. Irvine
 */
public class A270874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270874() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {34, 26259, 294888, 2528263, 16531326, 84603579, 353479684, 1252968303, 3885899418L, 10799026531L, 27392790624L});
  }
}

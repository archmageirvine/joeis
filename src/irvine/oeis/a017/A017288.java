package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017288 a(n) = (10*n + 1)^8.
 * @author Sean A. Irvine
 */
public class A017288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017288() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 214358881, 37822859361L, 852891037441L, 7984925229121L, 45767944570401L, 191707312997281L, 645753531245761L, 1853020188851841L});
  }
}

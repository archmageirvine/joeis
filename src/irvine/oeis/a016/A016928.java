package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016928 a(n) = (6*n + 1)^8.
 * @author Sean A. Irvine
 */
public class A016928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016928() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 5764801, 815730721, 16983563041L, 152587890625L, 852891037441L, 3512479453921L, 11688200277601L, 33232930569601L});
  }
}

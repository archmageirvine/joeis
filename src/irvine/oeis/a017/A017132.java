package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017132 <code>a(n) = (8*n + 5)^8</code>.
 * @author Sean A. Irvine
 */
public class A017132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017132() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {390625, 815730721, 37822859361L, 500246412961L, 3512479453921L, 16815125390625L, 62259690411361L, 191707312997281L, 513798374428641L});
  }
}

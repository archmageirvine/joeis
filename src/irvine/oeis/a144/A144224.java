package irvine.oeis.a144;
// Generated by gen_seq4.pl trireluc

import irvine.oeis.a001.A001519;
import irvine.oeis.triangle.ReluctantSequence;

/**
 * A144224 T(n,k) is the number of idempotent order-preserving full transformations (of an n-element chain) of waist k (waist(alpha) = max(Im(alpha))).
 * @author Georg Fischer
 */
public class A144224 extends ReluctantSequence {

  /** Construct the sequence. */
  public A144224() {
    super(1, new A001519().skip(1));
  }
}


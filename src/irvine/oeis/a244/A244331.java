package irvine.oeis.a244;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a296.A296965;

/**
 * A244331 Number of binary digits in the high-water marks of the terms of the continued fraction of the base-2 Champernowne constant.
 * @author Sean A. Irvine
 */
public class A244331 extends PartialSumSequence {

  /** Construct the sequence. */
  public A244331() {
    super(1, new A296965());
  }
}

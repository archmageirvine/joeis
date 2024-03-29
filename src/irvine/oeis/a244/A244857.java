package irvine.oeis.a244;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-22 19:20

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a007.A007602;
import irvine.oeis.a034.A034087;

/**
 * A244857 Numbers divisible by both the sum of the squares of their digits and the product of their digits.
 * @author Georg Fischer
 */
public class A244857 extends IntersectionSequence {

  /** Construct the sequence. */
  public A244857() {
    super(new A034087(), new A007602());
  }
}

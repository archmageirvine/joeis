package irvine.oeis.a083;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a022.A022158;

/**
 * A083657 a(n) = Sum_{i=1..n} floor(r*floor(r*i)) where r=sqrt(3).
 * @author Sean A. Irvine
 */
public class A083657 extends PartialSumSequence {

  /** Construct the sequence. */
  public A083657() {
    super(1, new A022158());
  }
}

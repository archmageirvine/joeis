package irvine.oeis.a078;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A078307 a(n) = Sum_{d divides n} (-1)^(n/d+1)*d^3.
 * @author Georg Fischer
 */
public class A078307 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A078307() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.ONE.shiftLeft(3L * e).multiply(6).add(1).divide(7) : p.pow(3L * e + 3).subtract(1).divide(p.pow(3).subtract(1)));
  }
}

package irvine.oeis.a078;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A078747 Expansion of Sum_{k&gt;0} k*phi(k)*x^k/(1+x^k).
 * @author Georg Fischer
 */
public class A078747 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A078747() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.ONE.shiftLeft(2L * e).subtract(1).divide(3) : p.pow(2L * e + 1).add(1).divide(p.add(1)));
  }
}

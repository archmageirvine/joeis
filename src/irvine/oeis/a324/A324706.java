package irvine.oeis.a324;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.oeis.MultiplicativeSequence;

/**
 * A324706 The sum of the tri-unitary divisors of n.
 * @author Georg Fischer
 */
public class A324706 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A324706() {
    super(1, (p, e) -> e == 3 ? p.multiply(p.multiply(p.add(1)).add(1)).add(1) : (e == 6 ? p.square().multiply(p.square().multiply(p.square().add(1)).add(1)).add(1) : p.pow(e).add(1)));
  }
}

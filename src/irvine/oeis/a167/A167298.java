package irvine.oeis.a167;
// manually mult1/mult at 2022-07-19 17:44

import irvine.oeis.MultiplicativeSequence;

/**
 * A167298 Totally multiplicative sequence with a(p) = 6*(p-2) for prime p.
 * @author Georg Fischer
 */
public class A167298 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A167298() {
    super(1, (p, e) -> p.add(-2).multiply(6).pow(e));
  }
}

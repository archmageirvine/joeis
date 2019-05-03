package irvine.oeis.a294;

import irvine.oeis.FiniteSequence;

/**
 * A294528 <code>a(n)</code> is the smallest prime that begins a run of exactly n consecutive numbers having <code>2, 4</code>, ..., <code>2n</code> divisors, or -1 if no such prime exists.
 * @author Georg Fischer
 */
public class A294528 extends FiniteSequence {

  /** Construct the sequence. */
  public A294528() {
    super(2, 5, 61, 421, 1524085621L);
  }
}

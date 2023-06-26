package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014117 Numbers n such that m^(n+1) == m (mod n) holds for all m.
 * @author Sean A. Irvine
 */
public class A014117 extends FiniteSequence {

  /** Construct the sequence. */
  public A014117() {
    super(1, FINITE, 1, 2, 6, 42, 1806);
  }
}

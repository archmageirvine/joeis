package irvine.oeis.a292;

import irvine.oeis.FiniteSequence;

/**
 * A292151 Orphelins (orphans): Numbers in two disjoint sectors of the Roulette wheel addressed by <code>an</code> announced bet in European (French) Roulette.
 * @author Georg Fischer
 */
public class A292151 extends FiniteSequence {

  /** Construct the sequence. */
  public A292151() {
    super(1, 6, 9, 14, 17, 20, 31, 34);
  }
}

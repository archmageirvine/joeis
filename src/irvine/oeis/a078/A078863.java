package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078863 Smallest primes from A029710, each belonging to those different residue class of mod 210 which are listed in A078860. Arranged according to possible least positive residues mod 210.
 * @author Georg Fischer
 */
public class A078863 extends FiniteSequence {

  /** Construct the sequence. */
  public A078863() {
    super(7, 13, 19, 37, 43, 67, 79, 97, 103, 109, 127, 349, 163, 379, 397, 193);
  }
}

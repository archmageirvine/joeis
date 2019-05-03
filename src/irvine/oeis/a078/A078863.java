package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078863 Smallest primes from <code>A029710</code>, each belonging to those different residue class of <code>mod 210</code> which are listed in <code>A078860</code>. Arranged according to possible least positive residues <code>mod 210</code>.
 * @author Georg Fischer
 */
public class A078863 extends FiniteSequence {

  /** Construct the sequence. */
  public A078863() {
    super(7, 13, 19, 37, 43, 67, 79, 97, 103, 109, 127, 349, 163, 379, 397, 193);
  }
}

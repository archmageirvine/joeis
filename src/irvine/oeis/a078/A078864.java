package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078864 Smallest primes from <code>A001359</code>, each belonging to those different residue class of <code>mod 210</code> which are listed in <code>A078859</code>. Arranged according to possible least positive residues <code>mod 210</code>.
 * @author Georg Fischer
 */
public class A078864 extends FiniteSequence {

  /** Construct the sequence. */
  public A078864() {
    super(3, 5, 11, 17, 29, 41, 59, 71, 101, 107, 137, 149, 179, 191, 197, 419, 1427);
  }
}

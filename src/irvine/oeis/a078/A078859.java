package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078859 Least positive residues <code>(mod 210)</code> representing those residue classes which can be the lesser of twin prime pairs (A001359).
 * @author Georg Fischer
 */
public class A078859 extends FiniteSequence {

  /** Construct the sequence. */
  public A078859() {
    super(3, 5, 11, 17, 29, 41, 59, 71, 101, 107, 137, 149, 167, 179, 191, 197, 209);
  }
}

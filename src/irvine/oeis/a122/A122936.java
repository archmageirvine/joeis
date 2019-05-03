package irvine.oeis.a122;

import irvine.oeis.FiniteSequence;

/**
 * A122936 2-Round numbers: numbers n such that every number less than n and relatively prime to n has at most two prime factors <code>(counting multiplicities)</code>.
 * @author Georg Fischer
 */
public class A122936 extends FiniteSequence {

  /** Construct the sequence. */
  public A122936() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 30, 36, 42, 48, 54, 60, 66, 72, 78, 84, 90, 96, 102, 108, 114, 120, 150, 180, 210, 240, 270, 300, 330, 420, 630, 840, 1050, 1260);
  }
}

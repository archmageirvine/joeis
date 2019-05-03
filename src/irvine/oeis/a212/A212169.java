package irvine.oeis.a212;

import irvine.oeis.FiniteSequence;

/**
 * A212169 List of highly composite numbers <code>(A002182)</code> with an exponent in its prime factorization that is at least as great as the number of positive exponents; intersection of <code>A002182</code> and <code>A212165</code>.
 * @author Georg Fischer
 */
public class A212169 extends FiniteSequence {

  /** Construct the sequence. */
  public A212169() {
    super(1, 2, 4, 12, 24, 36, 48, 120, 240, 360, 720, 1680, 5040, 10080, 15120, 20160, 25200, 45360, 50400, 110880, 221760, 332640, 554400, 665280, 2882880, 8648640, 14414400, 17297280, 43243200, 294053760L);
  }
}

package irvine.oeis.a214;

import irvine.oeis.FiniteSequence;

/**
 * A214934 Numbers <code>R(k)</code> such that <code>R(k) &gt;= 2k</code> log <code>R(k)</code>, where <code>R(k) =</code> A104272(k) is the k-th Ramanujan prime.
 * @author Georg Fischer
 */
public class A214934 extends FiniteSequence {

  /** Construct the sequence. */
  public A214934() {
    super(2, 11, 17, 29, 41, 47, 59, 97, 127, 149, 151, 167, 179, 227, 229, 233, 347, 367, 401, 409, 569, 571, 587, 593, 937, 1423, 1427, 2237, 2617, 2657, 2659, 3251);
  }
}

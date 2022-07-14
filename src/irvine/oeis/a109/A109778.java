package irvine.oeis.a109;
// manually (wroot) at 2021-07-03

import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a014.A014487;
import irvine.oeis.recur.PolynomialRootSequence;

/**
 * A109778 G.f. = 18th root of Hamming weight enumerator of [18,9,8]_4 self-dual code S_18 over GF(4) (cf. A014487).
 * @author Georg Fischer
 */
public class A109778 extends PolynomialRootSequence {

  /** Construct the sequence. */
  public A109778() {
    super(0, 18, new ZeroSpacedSequence(new A014487(), 1), 20);
  }
}

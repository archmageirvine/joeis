package irvine.oeis.a194;

import irvine.oeis.FiniteSequence;

/**
 * A194099 Numbers m&gt;=2, such that, if a prime p divides m^2-1, then every prime q&lt;p divides m^2-1 as well.
 * @author Sean A. Irvine
 */
public class A194099 extends FiniteSequence {

  /** Construct the sequence. */
  public A194099() {
    super(1, FINITE, 3, 5, 7, 11, 17, 19, 29, 31, 41, 49, 71, 161, 251, 449, 769, 881, 1079, 1429, 3431, 4159, 4801, 6049, 8749, 19601, 24751, 246401, 388961, 1267111);
  }
}


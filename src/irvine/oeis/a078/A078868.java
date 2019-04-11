package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078868 Decimal concatenations of the quadruples (d1,d2,d3,d4) with elements in <code>{2,4,6}</code> for which there exists a prime p <code>&gt;= 5</code> such that the differences between the 5 consecutive primes starting with p are (d1,d2,d3,d4).
 * @author Georg Fischer
 */
public class A078868 extends FiniteSequence {

  /** Construct the sequence. */
  public A078868() {
    super(2424, 2462, 2466, 2642, 2646, 2664, 2666, 4242, 4246, 4264, 4624, 4626, 4662, 4666, 6246, 6264, 6266, 6424, 6426, 6462, 6466, 6626, 6642, 6646, 6662, 6664);
  }
}

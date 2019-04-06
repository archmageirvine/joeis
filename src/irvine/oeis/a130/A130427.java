package irvine.oeis.a130;

import irvine.oeis.FiniteSequence;

/**
 * A130427 Complete list of all 5 numbers n such that n is equal to the number of 5's in the decimal digits of all numbers &lt;= n.
 * @author Georg Fischer
 */
public class A130427 extends FiniteSequence {

  /** Construct the sequence. */
  public A130427() {
    super(0, 10000000000L, 20000000000L, 30000000000L, 40000000000L);
  }
}

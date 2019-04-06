package irvine.oeis.a130;

import irvine.oeis.FiniteSequence;

/**
 * A130431 Complete list of all 9 numbers n such that n is equal to the number of 9's in the decimal digits of all numbers &lt;= n.
 * @author Georg Fischer
 */
public class A130431 extends FiniteSequence {

  /** Construct the sequence. */
  public A130431() {
    super(0, 10000000000L, 20000000000L, 30000000000L, 40000000000L, 50000000000L, 60000000000L, 70000000000L, 80000000000L);
  }
}

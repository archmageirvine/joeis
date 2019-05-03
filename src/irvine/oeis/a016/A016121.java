package irvine.oeis.a016;

import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.a008.A008934;

/**
 * A016121 Number of sequences <code>(a_1, a_2</code>, ..., <code>a_n)</code> of length n with <code>a_1 = 1</code> satisfying <code>a_i &lt;= a_{i+1} &lt;= 2*a_i</code>.
 * @author Sean A. Irvine
 */
public class A016121 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A016121() {
    super(new A008934(), 0);
  }
}

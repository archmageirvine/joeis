package irvine.oeis.a016;

import irvine.oeis.transform.BinomialTransformSequence;
import irvine.oeis.a008.A008934;

/**
 * A016121 Number of sequences (a_1, a_2, ..., a_n) of length n with a_1 = 1 satisfying a_i &lt;= a_{i+1} &lt;= 2*a_i.
 * @author Sean A. Irvine
 */
public class A016121 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A016121() {
    super(new A008934(), 0);
  }
}

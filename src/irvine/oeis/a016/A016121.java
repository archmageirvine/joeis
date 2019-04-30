package irvine.oeis.a016;

import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.a008.A008934;

/**
 * A016121 Number of sequences (a_1, a_2, <code>..</code>., a_n) of length n with a_1 <code>= 1</code> satisfying a_i <code>&lt;=</code> a_{i+1} <code>&lt;=</code> 2*a_i.
 * @author Sean A. Irvine
 */
public class A016121 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A016121() {
    super(new A008934(), 0);
  }
}

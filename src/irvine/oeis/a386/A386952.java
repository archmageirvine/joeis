package irvine.oeis.a386;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A386952 Number of entries in the n-th row of Pascal's triangle not divisible by 9.
 * @author Sean A. Irvine
 */
public class A386952 extends LambdaSequence {

  /** Construct the sequence. */
  public A386952() {
    super(0, n -> Integers.SINGLETON.count(0, n, k -> Binomial.binomial(n, k, 9) != 0));
  }
}

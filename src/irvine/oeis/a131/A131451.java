package irvine.oeis.a131;
// manually exprs/lambdan at 2024-05-28 21:26

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A131451 Product of the nonzero digital products of all the numbers 1 to n (a 'total digital-product factorial' in base 10).
 * @author Georg Fischer
 */
public class A131451 extends LambdaSequence {

  /** Construct the sequence. */
  public A131451() {
    super(1, n -> Integers.SINGLETON.product(1, n, k -> Functions.DIGIT_NZ_PRODUCT.z(k)));
  }
}

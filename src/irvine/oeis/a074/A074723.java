package irvine.oeis.a074;
// manually knowna4/simtraf at 2023-10-03 22:13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014445;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074723 Largest power of 2 dividing F(3n) where F(k) is the k-th Fibonacci number.
 * @author Georg Fischer
 */
public class A074723 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A074723() {
    super(1, new A014445(), v -> Z.TWO.pow(Functions.VALUATION.i(v, Z.TWO)));
    skip(1);
  }
}

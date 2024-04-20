package irvine.oeis.a100;

import irvine.math.function.Functions;
import irvine.oeis.a003.A003590;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A100755 Smallest prime factor of the concatenation of terms in the n-th row of Pascal's Triangle.
 * @author Georg Fischer
 */
public class A100755 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A100755() {
    super(1, new A003590().skip(1), Functions.LPF::z);
  }
}

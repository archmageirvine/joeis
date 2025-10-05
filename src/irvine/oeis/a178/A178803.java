package irvine.oeis.a178;

import irvine.math.function.Functions;
import irvine.oeis.a036.A036043;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A178803 Write the factorial of each term in A036043(n).
 * @author Georg Fischer
 */
public class A178803 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A178803() {
    super(0, new A036043(), Functions.FACTORIAL::z);
  }
}

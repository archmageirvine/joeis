package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.oeis.a064.A064078;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A086251 Number of primitive prime factors of 2^n - 1.
 * @author Georg Fischer
 */
public class A086251 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A086251() {
    super(1, new A064078(), Functions.OMEGA::z);
  }
}

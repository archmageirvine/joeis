package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.oeis.a067.A067340;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077480 Total number of prime factors of numbers m with bigomega(m) == 0 modulo omega(m) (counted with repetition).
 * @author Sean A. Irvine
 */
public class A077480 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077480() {
    super(1, new A067340(), Functions.BIG_OMEGA::z);
  }
}

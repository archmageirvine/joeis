package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.a055.A055932;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394258 Largest prime less than the n-th prime-complete number.
 * @author Sean A. Irvine
 */
public class A394258 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394258() {
    super(2, new A055932().skip(2), Functions.PREV_PRIME::z);
  }
}


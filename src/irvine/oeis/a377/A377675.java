package irvine.oeis.a377;

import irvine.math.function.Functions;
import irvine.oeis.a061.A061190;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A377675 Number of prime factors of n^n-n (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A377675 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A377675() {
    super(2, new A061190().skip(2), Functions.BIG_OMEGA::z);
  }
}

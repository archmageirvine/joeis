package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.a007.A007504;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075882 a(n) = phi(Sum_{i=1..n} prime(i)).
 * @author Sean A. Irvine
 */
public class A075882 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075882() {
    super(1, new A007504().skip(), Functions.PHI::z);
  }
}

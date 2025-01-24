package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.a007.A007318;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074589 Replace each number n in Pascal's triangle with the n-th prime.
 * @author Sean A. Irvine
 */
public class A074589 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A074589() {
    super(0, new A007318(), Functions.PRIME::z);
  }
}

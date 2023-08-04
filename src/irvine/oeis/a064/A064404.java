package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A064404 When the numerator - denominator (A064169) in n-th harmonic number is prime.
 * @author Sean A. Irvine
 */
public class A064404 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A064404() {
    super(1, new A064169(), Z::isProbablePrime);
  }
}


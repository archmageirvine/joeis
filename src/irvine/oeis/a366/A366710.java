package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024140;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366710 Sum of the divisors of 12^n-1.
 * @author Sean A. Irvine
 */
public class A366710 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366710() {
    super(1, new A024140().skip(), k -> Functions.SIGMA1.z(k));
  }
}


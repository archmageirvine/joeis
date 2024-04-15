package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024127;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366683 Number of divisors of 11^n-1.
 * @author Sean A. Irvine
 */
public class A366683 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366683() {
    super(1, new A024127().skip(), k -> Functions.SIGMA0.z(k));
  }
}


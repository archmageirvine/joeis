package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024049;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366612 Number of divisors of 5^n-1.
 * @author Sean A. Irvine
 */
public class A366612 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366612() {
    super(1, new A024049().skip(), k -> Functions.SIGMA0.z(k));
  }
}


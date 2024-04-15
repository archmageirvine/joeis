package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024062;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366622 Sum of the divisors of 6^n-1.
 * @author Sean A. Irvine
 */
public class A366622 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366622() {
    super(1, new A024062().skip(), k -> Functions.SIGMA.z(k));
  }
}


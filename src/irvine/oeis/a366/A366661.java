package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024101;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366661 Number of divisors of 9^n-1.
 * @author Sean A. Irvine
 */
public class A366661 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366661() {
    super(1, new A024101().skip(), k -> Functions.SIGMA0.z(k));
  }
}


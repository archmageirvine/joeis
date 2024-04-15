package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024075;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366633 Number of divisors of 7^n-1.
 * @author Sean A. Irvine
 */
public class A366633 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366633() {
    super(1, new A024075().skip(), k -> Functions.SIGMA0.z(k));
  }
}


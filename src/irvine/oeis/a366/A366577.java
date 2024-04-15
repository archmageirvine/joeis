package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a034.A034472;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366577 Number of divisors of 3^n+1.
 * @author Sean A. Irvine
 */
public class A366577 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366577() {
    super(0, new A034472(), k -> Functions.SIGMA0.z(k));
  }
}


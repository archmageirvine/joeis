package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a034.A034472;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366578 Sum of the divisors of 3^n+1.
 * @author Sean A. Irvine
 */
public class A366578 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366578() {
    super(0, new A034472(), k -> Functions.SIGMA1.z(k));
  }
}


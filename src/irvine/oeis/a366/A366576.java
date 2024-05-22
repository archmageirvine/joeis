package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024023;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366576 Sum of the divisors of 3^n-1.
 * @author Sean A. Irvine
 */
public class A366576 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366576() {
    super(1, new A024023().skip(), k -> Functions.SIGMA1.z(k));
  }
}


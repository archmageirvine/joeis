package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024127;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366684 Sum of the divisors of 11^n-1.
 * @author Sean A. Irvine
 */
public class A366684 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366684() {
    super(1, new A024127().skip(), k -> Functions.SIGMA.z(k));
  }
}


package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024088;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366653 Sum of the divisors of 8^n-1.
 * @author Sean A. Irvine
 */
public class A366653 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366653() {
    super(1, new A024088().skip(), k -> Functions.SIGMA.z(k));
  }
}


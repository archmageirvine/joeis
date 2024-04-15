package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024049;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366613 Sum of the divisors of 5^n-1.
 * @author Sean A. Irvine
 */
public class A366613 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366613() {
    super(1, new A024049().skip(), k -> Functions.SIGMA.z(k));
  }
}


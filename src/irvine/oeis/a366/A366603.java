package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024036;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366603 Sum of the divisors of 4^n-1.
 * @author Sean A. Irvine
 */
public class A366603 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366603() {
    super(1, new A024036().skip(), k -> Functions.SIGMA1.z(k));
  }
}


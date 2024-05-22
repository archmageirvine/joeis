package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a178.A178248;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366715 Sum of the divisors of 12^n+1.
 * @author Sean A. Irvine
 */
public class A366715 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366715() {
    super(0, new A178248(), k -> Functions.SIGMA1.z(k));
  }
}


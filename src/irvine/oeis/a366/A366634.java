package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024075;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366634 Sum of the divisors of 7^n-1.
 * @author Sean A. Irvine
 */
public class A366634 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366634() {
    super(1, new A024075().skip(), k -> Functions.SIGMA.z(k));
  }
}


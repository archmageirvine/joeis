package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a062.A062395;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366658 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366658() {
    super(0, new A062395(), k -> Euler.phi(k));
  }
}


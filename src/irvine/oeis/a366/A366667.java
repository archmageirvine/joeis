package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a062.A062396;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366667 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366667() {
    super(0, new A062396(), k -> Euler.phi(k));
  }
}


package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a062.A062394;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366630 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366630() {
    super(0, new A062394(), k -> Euler.phi(k));
  }
}


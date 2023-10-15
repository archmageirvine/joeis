package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a024.A024062;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366623 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366623() {
    super(1, new A024062().skip(), k -> Euler.phi(k));
  }
}


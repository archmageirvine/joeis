package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a024.A024101;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366663 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366663() {
    super(1, new A024101().skip(), k -> Euler.phi(k));
  }
}


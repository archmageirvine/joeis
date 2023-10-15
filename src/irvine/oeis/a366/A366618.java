package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a034.A034474;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366618 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366618() {
    super(0, new A034474(), k -> Euler.phi(k));
  }
}


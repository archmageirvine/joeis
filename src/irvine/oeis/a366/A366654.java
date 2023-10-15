package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a024.A024088;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366654 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366654() {
    super(1, new A024088().skip(), k -> Euler.phi(k));
  }
}


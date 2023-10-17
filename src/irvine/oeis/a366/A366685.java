package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a024.A024127;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366685 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366685() {
    super(1, new A024127().skip(), k -> Euler.phi(k));
  }
}


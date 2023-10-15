package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a024.A024075;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366635 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366635() {
    super(1, new A024075().skip(), k -> Euler.phi(k));
  }
}


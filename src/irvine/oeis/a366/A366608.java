package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a052.A052539;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366608 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366608() {
    super(0, new A052539(), k -> Euler.phi(k));
  }
}


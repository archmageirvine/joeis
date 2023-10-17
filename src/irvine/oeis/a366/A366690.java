package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a034.A034524;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366690 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366690() {
    super(0, new A034524(), k -> Euler.phi(k));
  }
}


package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a024.A024140;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366711 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366711() {
    super(1, new A024140().skip(), k -> Euler.phi(k));
  }
}


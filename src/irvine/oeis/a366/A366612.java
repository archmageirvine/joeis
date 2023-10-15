package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a024.A024049;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366612 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366612() {
    super(1, new A024049().skip(), k -> Jaguar.factor(k).sigma0());
  }
}


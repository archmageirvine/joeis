package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a062.A062396;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366666 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366666() {
    super(0, new A062396(), k -> Jaguar.factor(k).sigma());
  }
}


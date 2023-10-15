package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a024.A024062;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366622 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366622() {
    super(1, new A024062().skip(), k -> Jaguar.factor(k).sigma());
  }
}


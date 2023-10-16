package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a024.A024101;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366662 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366662() {
    super(1, new A024101().skip(), k -> Jaguar.factor(k).sigma());
  }
}


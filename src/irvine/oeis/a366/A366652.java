package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a024.A024088;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366652 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366652() {
    super(1, new A024088().skip(), k -> Jaguar.factor(k).sigma0());
  }
}


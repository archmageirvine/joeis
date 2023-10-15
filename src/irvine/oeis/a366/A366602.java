package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a024.A024036;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366602 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366602() {
    super(1, new A024036().skip(), k -> Jaguar.factor(k).sigma0());
  }
}


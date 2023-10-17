package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a024.A024140;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366709 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366709() {
    super(1, new A024140().skip(), k -> Jaguar.factor(k).sigma0());
  }
}


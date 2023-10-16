package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a062.A062397;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366668 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366668() {
    super(0, new A062397(), k -> Jaguar.factor(k).sigma());
  }
}


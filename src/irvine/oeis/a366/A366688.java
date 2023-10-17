package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a034.A034524;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366688 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366688() {
    super(0, new A034524(), k -> Jaguar.factor(k).sigma0());
  }
}


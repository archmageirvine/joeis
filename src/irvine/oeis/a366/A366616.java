package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a034.A034474;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366616 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366616() {
    super(0, new A034474(), k -> Jaguar.factor(k).sigma0());
  }
}


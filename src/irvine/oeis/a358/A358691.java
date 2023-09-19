package irvine.oeis.a358;

import irvine.oeis.a031.A031368;
import irvine.oeis.transform.GilbreathTransformSequence;

/**
 * A362451.
 * @author Sean A. Irvine
 */
public class A358691 extends GilbreathTransformSequence {

  /** Construct the sequence. */
  public A358691() {
    super(1, new A031368());
    next();
  }
}

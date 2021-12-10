package irvine.oeis.a032;

import irvine.oeis.transform.DikTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A032286 "DIK" (bracelet, indistinct, unlabeled) transform of 5,5,5,5...
 * @author Sean A. Irvine
 */
public class A032286 extends DikTransformSequence {

  {
    next();
  }

  /** Construct the sequence. */
  public A032286() {
    super(new PeriodicSequence(5), 0);
  }
}

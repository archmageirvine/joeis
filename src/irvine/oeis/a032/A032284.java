package irvine.oeis.a032;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.DikTransformSequence;

/**
 * A032284 "DIK" (bracelet, indistinct, unlabeled) transform of 3,3,3,3...
 * @author Sean A. Irvine
 */
public class A032284 extends DikTransformSequence {

  {
    next();
  }

  /** Construct the sequence. */
  public A032284() {
    super(new PeriodicSequence(3), 0);
  }
}

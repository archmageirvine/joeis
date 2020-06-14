package irvine.oeis.a032;

import irvine.oeis.DikTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A032283 "DIK" <code>(bracelet</code>, indistinct, unlabeled) transform of 2,2,2,2...
 * @author Sean A. Irvine
 */
public class A032283 extends DikTransformSequence {

  {
    next();
  }

  /** Construct the sequence. */
  public A032283() {
    super(new PeriodicSequence(2), 0);
  }
}

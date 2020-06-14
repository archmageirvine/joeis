package irvine.oeis.a032;

import irvine.oeis.DikTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A032285 "DIK" <code>(bracelet</code>, indistinct, unlabeled) transform of 4,4,4,4...
 * @author Sean A. Irvine
 */
public class A032285 extends DikTransformSequence {

  {
    next();
  }

  /** Construct the sequence. */
  public A032285() {
    super(new PeriodicSequence(4), 0);
  }
}

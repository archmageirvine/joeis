package irvine.oeis.a035;

import irvine.oeis.BikTransformSequence;
import irvine.oeis.a000.A000237;

/**
 * A035350 "BIK" <code>(reversible</code>, indistinct, unlabeled) transform of <code>A000237</code>.
 * @author Sean A. Irvine
 */
public class A035350 extends BikTransformSequence {

  /** Construct the sequence. */
  public A035350() {
    super(new A000237(), 1);
  }
}


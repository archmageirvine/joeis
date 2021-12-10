package irvine.oeis.a035;

import irvine.oeis.a000.A000237;
import irvine.oeis.transform.BikTransformSequence;

/**
 * A035350 "BIK" (reversible, indistinct, unlabeled) transform of A000237.
 * @author Sean A. Irvine
 */
public class A035350 extends BikTransformSequence {

  /** Construct the sequence. */
  public A035350() {
    super(new A000237(), 1);
  }
}


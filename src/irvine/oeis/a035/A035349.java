package irvine.oeis.a035;

import irvine.oeis.a000.A000237;
import irvine.oeis.transform.DikTransformSequence;

/**
 * A035349 "DIK" (bracelet, indistinct, unlabeled) transform of A000237.
 * @author Sean A. Irvine
 */
public class A035349 extends DikTransformSequence {

  /** Construct the sequence. */
  public A035349() {
    super(0, new A000237(), 1);
  }
}


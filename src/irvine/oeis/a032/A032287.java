package irvine.oeis.a032;

import irvine.oeis.transform.DikTransformSequence;
import irvine.oeis.a000.A000027;

/**
 * A032287 "DIK" (bracelet, indistinct, unlabeled) transform of 1,2,3,4,...
 * @author Sean A. Irvine
 */
public class A032287 extends DikTransformSequence {

  {
    next();
  }

  /** Construct the sequence. */
  public A032287() {
    super(new A000027(), 0);
  }
}

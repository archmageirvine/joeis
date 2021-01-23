package irvine.oeis.a032;

import irvine.oeis.DikTransformSequence;
import irvine.oeis.a005.A005408;

/**
 * A032288 "DIK" (bracelet, indistinct, unlabeled) transform of 1,3,5,7...
 * @author Sean A. Irvine
 */
public class A032288 extends DikTransformSequence {

  {
    next();
  }

  /** Construct the sequence. */
  public A032288() {
    super(new A005408(), 0);
  }
}

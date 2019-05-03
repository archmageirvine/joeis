package irvine.oeis.a035;

import irvine.oeis.DikTransformSequence;
import irvine.oeis.a000.A000237;

/**
 * A035349 "DIK" <code>(bracelet</code>, indistinct, unlabeled) transform of <code>A000237</code>.
 * @author Sean A. Irvine
 */
public class A035349 extends DikTransformSequence {

  /** Construct the sequence. */
  public A035349() {
    super(new A000237(), 1);
  }
}


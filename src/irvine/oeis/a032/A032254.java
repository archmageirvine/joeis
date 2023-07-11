package irvine.oeis.a032;

import irvine.oeis.a000.A000027;
import irvine.oeis.transform.DhkTransformSequence;

/**
 * A032254 "DHK" (bracelet, identity, unlabeled) transform of 1,2,3,4,...
 * @author Sean A. Irvine
 */
public class A032254 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032254() {
    super(0, new A000027());
  }
}

package irvine.oeis.a032;

import irvine.oeis.DhkTransformSequence;
import irvine.oeis.a057.A057427;

/**
 * A032244 "DHK" (bracelet, identity, unlabeled) transform of 0,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032244 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032244() {
    super(new A057427());
  }
}

package irvine.oeis.a032;

import irvine.oeis.a000.A000012;
import irvine.oeis.transform.DhkTransformSequence;

/**
 * A032245 "DHK" (bracelet, identity, unlabeled) transform of 1,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032245 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032245() {
    super(0, new A000012());
  }
}

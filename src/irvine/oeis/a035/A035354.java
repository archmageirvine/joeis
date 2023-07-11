package irvine.oeis.a035;

import irvine.oeis.transform.DhkTransformSequence;

/**
 * A035354 "DHK" (bracelet, identity, unlabeled) transform of A035353.
 * @author Sean A. Irvine
 */
public class A035354 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A035354() {
    super(0, new A035353().skip(1));
  }
}

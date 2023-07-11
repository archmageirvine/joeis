package irvine.oeis.a032;

import irvine.oeis.a054.A054977;
import irvine.oeis.transform.DhkTransformSequence;

/**
 * A032252 "DHK" (bracelet, identity, unlabeled) transform of 2,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032252 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032252() {
    super(0, new A054977());
  }
}

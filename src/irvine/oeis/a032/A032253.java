package irvine.oeis.a032;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.DhkTransformSequence;

/**
 * A032253 "DHK" (bracelet, identity, unlabeled) transform of 3,3,3,3,...
 * @author Sean A. Irvine
 */
public class A032253 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032253() {
    super(0, new PeriodicSequence(3));
  }
}

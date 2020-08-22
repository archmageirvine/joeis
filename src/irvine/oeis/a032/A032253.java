package irvine.oeis.a032;

import irvine.oeis.DhkTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A032253 "DHK" (bracelet, identity, unlabeled) transform of 3,3,3,3,...
 * @author Sean A. Irvine
 */
public class A032253 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032253() {
    super(new PeriodicSequence(3));
  }
}

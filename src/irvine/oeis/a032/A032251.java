package irvine.oeis.a032;

import irvine.oeis.transform.DhkTransformSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A032251 "DHK" (bracelet, identity, unlabeled) transform of 2,2,2,2,...
 * @author Sean A. Irvine
 */
public class A032251 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032251() {
    super(new PeriodicSequence(2));
  }
}

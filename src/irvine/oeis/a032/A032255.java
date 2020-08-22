package irvine.oeis.a032;

import irvine.oeis.DhkTransformSequence;
import irvine.oeis.a005.A005408;

/**
 * A032255 "DHK" (bracelet, identity, unlabeled) transform of 1,3,5,7,...
 * @author Sean A. Irvine
 */
public class A032255 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032255() {
    super(new A005408());
  }
}

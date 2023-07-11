package irvine.oeis.a032;

import irvine.oeis.a059.A059841;
import irvine.oeis.transform.DhkTransformSequence;

/**
 * A032243 "DHK" (bracelet, identity, unlabeled) transform of 1,0,1,0,... (odd).
 * @author Sean A. Irvine
 */
public class A032243 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032243() {
    super(0, new A059841());
  }
}

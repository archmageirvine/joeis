package irvine.oeis.a032;

import irvine.oeis.DhkTransformSequence;
import irvine.oeis.a059.A059841;

/**
 * A032243 "DHK" <code>(bracelet</code>, identity, unlabeled) transform of <code>1,0,1,0,..</code>. (odd).
 * @author Sean A. Irvine
 */
public class A032243 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032243() {
    super(new A059841());
  }
}

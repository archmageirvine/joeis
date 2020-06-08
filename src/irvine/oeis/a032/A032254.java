package irvine.oeis.a032;

import irvine.oeis.DhkTransformSequence;
import irvine.oeis.a000.A000027;

/**
 * A032254 "DHK" <code>(bracelet</code>, identity, unlabeled) transform of 1,2,3,4,...
 * @author Sean A. Irvine
 */
public class A032254 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032254() {
    super(new A000027());
  }
}

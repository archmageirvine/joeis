package irvine.oeis.a032;

import irvine.oeis.DhkTransformSequence;
import irvine.oeis.a000.A000012;

/**
 * A032245 "DHK" <code>(bracelet</code>, identity, unlabeled) transform of 1,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032245 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032245() {
    super(new A000012());
  }
}

package irvine.oeis.a032;

import irvine.oeis.DhkTransformSequence;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A032252 "DHK" <code>(bracelet</code>, identity, unlabeled) transform of 2,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032252 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032252() {
    super(new PrependSequence(new PeriodicSequence(1), 2));
  }
}

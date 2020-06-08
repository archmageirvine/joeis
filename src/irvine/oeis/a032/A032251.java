package irvine.oeis.a032;

import irvine.oeis.DhkTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A032251 "DHK" <code>(bracelet</code>, identity, unlabeled) transform of 2,2,2,2,...
 * @author Sean A. Irvine
 */
public class A032251 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032251() {
    super(new PeriodicSequence(2));
  }
}

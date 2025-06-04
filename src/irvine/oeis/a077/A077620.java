package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A077620 Numbers occurring only once in A076734.
 * @author Sean A. Irvine
 */
public class A077620 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A077620() {
    super(1, new A077618(), Z::isOne);
  }
}

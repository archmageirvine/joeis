package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006513;

/**
 * A076082.
 * @author Sean A. Irvine
 */
public class A076138 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076138() {
    super(1, 1, new A006513(), Z.ONE::equals);
  }
}

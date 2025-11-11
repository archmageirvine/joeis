package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006466;

/**
 * A081767.
 * @author Sean A. Irvine
 */
public class A081769 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081769() {
    super(1, new A006466(), Z.TWO::equals);
  }
}


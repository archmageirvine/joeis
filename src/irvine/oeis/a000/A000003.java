package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000003 Number of classes of primitive positive definite binary quadratic forms of discriminant D = -4n; or equivalently the class number of the quadratic order of discriminant D = -4n.
 * @author Sean A. Irvine
 */
public class A000003 extends AbstractSequence {

  /** Construct the sequence. */
  public A000003() {
    super(1);
  }

  private long mD = 0;

  // Cf. Cohen 5.3.5 and implementation in LongUtils.
  // This one has primitiveness check

  @Override
  public Z next() {
    mD -= 4;
    return Z.valueOf(LongUtils.classNumber(mD));
  }
}

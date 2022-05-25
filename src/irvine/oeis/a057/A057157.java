package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000722;

/**
 * A057157 Number of non-invertible functions from {0,1}^n to {0,1}^n.
 * @author Sean A. Irvine
 */
public class A057157 extends A057156 {

  private final Sequence mA = new A000722();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}


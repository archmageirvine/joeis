package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001447 <code>(5^n + 5^[ n/2 ] )/2</code>.
 * @author Sean A. Irvine
 */
public class A001447 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.FIVE.pow(mN).add(Z.FIVE.pow(mN / 2)).divide(2);
  }
}

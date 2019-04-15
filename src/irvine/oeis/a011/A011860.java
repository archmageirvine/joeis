package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011860 <code>Floor( n(n-1)/7 )</code>.
 * @author Sean A. Irvine
 */
public class A011860 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(7);
  }
}

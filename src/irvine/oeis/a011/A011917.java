package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011917 [ n(n-1)(n-2)(n-3)/7 ].
 * @author Sean A. Irvine
 */
public class A011917 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(mN - 1).multiply(mN - 2).multiply(++mN).divide(7);
  }
}

package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070837.
 * @author Sean A. Irvine
 */
public class A070855 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z nn = Z.valueOf(++mN).pow(mN);
    Z t = nn.add(1);
    while (!t.isProbablePrime()) {
      t = t.add(nn);
    }
    return t;
  }
}

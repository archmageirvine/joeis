package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011819.
 * @author Sean A. Irvine
 */
public class A011819 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply2().add(15).multiply(mN).add(50).multiply(mN).add(165).multiply(mN).add(308).multiply(mN).add(540).multiply(mN).add(720).divide(360);
  }
}


package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006852 Step at which n is expelled in Kimberling's puzzle (A035486).
 * @author Sean A. Irvine
 */
public class A006852 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z i = Z.valueOf((mN + 4) / 3);
    Z j = Z.valueOf((2 * mN + 1) / 3);
    while (!i.equals(j)) {
      j = i.multiply2().subtract(j.multiply2()).max(j.multiply2().subtract(i.multiply2()).subtract(1));
      i = i.add(1);
    }
    return i;
  }
}

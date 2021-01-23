package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000252 Number of invertible 2 X 2 matrices mod n.
 * @author Sean A. Irvine
 */
public class A000252 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    Z z = Z.valueOf(++mN).pow(4);
    for (final Z p : Cheetah.factor(mN).toZArray()) {
      z = z.multiply(p.square().subtract(Z.ONE)).multiply(p.subtract(Z.ONE)).divide(p.pow(3));
    }
    return z;
  }

}


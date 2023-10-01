package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066048 Product of smallest and greatest prime factors of n.
 * @author Sean A. Irvine
 */
public class A066048 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] f = Jaguar.factor(++mN).toZArray();
    return f.length == 0 ? Z.ONE : f[0].multiply(f[f.length - 1]);
  }

}

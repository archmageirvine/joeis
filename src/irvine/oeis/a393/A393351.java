package irvine.oeis.a393;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393351 a(n) is the lcm of n and all (p_i + e_i) in the canonical prime factorization of n.
 * @author Sean A. Irvine
 */
public class A393351 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z lcm = Z.valueOf(mN);
    for (final Z p : fs.toZArray()) {
      lcm = lcm.lcm(p.add(fs.getExponent(p)));
    }
    return lcm;
  }
}

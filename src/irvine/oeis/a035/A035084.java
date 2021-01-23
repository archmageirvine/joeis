package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.BikTransformSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A035084 BIK(b)-b where b is A035082.
 * @author Sean A. Irvine
 */
public class A035084 extends A035082 {

  @Override
  public Z next() {
    final Z t = super.next();
    final int n = mA.size();
    if (n <= 3) {
      return n == 3 ? Z.ONE : Z.ZERO;
    }
    final Sequence dik = new SkipSequence(new BikTransformSequence(new FiniteSequence(mA), 1), n - 1);
    return dik.next().subtract(t);
  }
}

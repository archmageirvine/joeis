package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.Permutation;

/**
 * A393306 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A393306 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final int b = (mN & 1) == 0 ? mN - 1 : (mN - 1) / 2;
    final Permutation perm = new Permutation(mN);
    int[] p;
    while ((p = perm.next()) != null) {
      Z x = Z.ZERO;
      for (final int v : p) {
        x = x.multiply(mN).add(mN - 1 - v);
      }
      final Z[] qr = x.divideAndRemainder(b);
      if (qr[1].isZero() && qr[0].isProbablePrime()) {
        return x;
      }
    }
    return Z.NEG_ONE;
  }
}

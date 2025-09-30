package irvine.oeis.a385;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A385233 Numbers that can be written as s^x + t^y + u^z with 1 &lt; s &lt; t &lt; u and {s,t,u} = {x,y,z} (the sequence of exponents can be any permutation of s,t,u).
 * @author Sean A. Irvine
 */
public class A385233 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 4;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(Z.ONE.shiftLeft(mN).add((long) mN * mN)) > 0) { // This condition could be made tighter
      final Bumper bumper = BumperFactory.increasing(mN);
      final int[] b = {2, 3};
      do {
        final Permutation perm = new Permutation(b.length + 1);
        int[] p;
        while ((p = perm.next()) != null) {
          Z sum = Z.ZERO;
          for (int k = 0; k < p.length; ++k) {
            final int pk = p[k];
            sum = sum.add(Z.valueOf(k == b.length ? mN : b[k]).pow(pk == b.length ? mN : b[pk]));
          }
          mA.add(sum);
        }
      } while (bumper.bump(b));
      ++mN;
    }
    return mA.pollFirst();
  }
}

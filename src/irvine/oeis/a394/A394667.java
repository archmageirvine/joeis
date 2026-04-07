package irvine.oeis.a394;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A394667 Integers which can be written as the sum of a prime and an anagram of that prime.
 * @author Sean A. Irvine
 */
public class A394667 extends A000040 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = super.next();

  @Override
  public Z next() {
    // This condition could be made tighter
    while (mA.isEmpty() || mA.first().compareTo(mP) > 0) {
      final Permutation perm = Permutation.permuter(mP);
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[0] != 0) {
          mA.add(mP.add(Permutation.permToZ(p)));
        }
      }
      mP = super.next();
    }
    return mA.pollFirst();
  }
}

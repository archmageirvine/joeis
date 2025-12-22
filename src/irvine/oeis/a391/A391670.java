package irvine.oeis.a391;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A391670 Numbers of the form h^i + k^j where h,i,j,k are distinct positive integers and max{h,i,j,k} - min{h,i,j,k} = 3.
 * @author Sean A. Irvine
 */
public class A391670 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 1;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(Z.valueOf(mN).pow(mN).multiply2()) > 0) {
      final Permutation perm = new Permutation(new int[] {mN, mN + 1, mN + 2, mN + 3});
      int[] p;
      while ((p = perm.next()) != null) {
        mA.add(Z.valueOf(p[0]).pow(p[1]).add(Z.valueOf(p[2]).pow(p[3])));
      }
      ++mN;
    }
    return mA.pollFirst();
  }
}

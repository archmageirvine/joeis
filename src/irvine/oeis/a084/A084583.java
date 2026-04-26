package irvine.oeis.a084;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084583 Let y = m/GK(k), where m and k vary over the positive integers and GK(k)=log(1+1/(k*(k+2)))/log(2) is the Gauss-Kuzmin distribution of k. Sort the y values by size and number them consecutively by n. This sequence gives the values of n when k=3.
 * @author Sean A. Irvine
 */
public class A084583 extends Sequence1 {

  private long mN = 0;
  private final TreeSet<A084577.State> mA = new TreeSet<>();
  {
    mA.add(new A084577.State(1, 1));
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final A084577.State s = mA.pollFirst();
      mA.add(new A084577.State(s.mM + 1, s.mK));
      mA.add(new A084577.State(s.mM, s.mK + 1));
      if (s.mK == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}


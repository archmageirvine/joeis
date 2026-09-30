package irvine.oeis.a086;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a046.A046816;

/**
 * A086753 Number of distinct entries in a slice of A046816.
 * @author Sean A. Irvine
 */
public class A086753 extends A046816 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Z> s = new HashSet<>();
    for (int i = 0; i <= mN; ++i) {
      for (int j = 0; j <= i; ++j) {
        s.add(get(i, j, mN));
      }
    }
    return Z.valueOf(s.size());
  }
}

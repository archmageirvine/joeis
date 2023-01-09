package irvine.oeis.a060;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060957 Number of different products (including the empty product) of any subset of {1, 2, 3, ..., n}.
 * @author Sean A. Irvine
 */
public class A060957 extends Sequence0 {

  private Set<Z> mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mA == null) {
      mA = Collections.singleton(Z.ONE);
    } else {
      final Set<Z> t = new HashSet<>(mA);
      for (final Z v : mA) {
        t.add(v.multiply(mN));
      }
      mA = t;
    }
    return Z.valueOf(mA.size());
  }
}

package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051445 Smallest k such that phi(k) = 2n, or 0 if there is no such k.
 * @author Sean A. Irvine
 */
public class A051445 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    final TreeSet<Z> res = Euler.inversePhi(Z.valueOf(mN));
    return res.isEmpty() ? Z.ZERO : res.first();
  }
}


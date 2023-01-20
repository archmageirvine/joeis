package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A061071 Number of distinct values in the list of number of divisors, d(j), j=1...n.
 * @author Sean A. Irvine
 */
public class A061071 extends A000005 {

  private final HashSet<Z> mA = new HashSet<>();

  @Override
  public Z next() {
    mA.add(super.next());
    return Z.valueOf(mA.size());
  }
}

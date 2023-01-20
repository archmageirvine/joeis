package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A061069 Number of distinct values in the list of divisor-sums {sigma(j) : j=1...n}.
 * @author Sean A. Irvine
 */
public class A061069 extends A000203 {

  private final HashSet<Z> mA = new HashSet<>();

  @Override
  public Z next() {
    mA.add(super.next());
    return Z.valueOf(mA.size());
  }
}

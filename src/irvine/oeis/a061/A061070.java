package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A061070 Number of distinct values in the list of values of the Euler totient function {phi(j) : j=1..n}.
 * @author Sean A. Irvine
 */
public class A061070 extends A000010 {

  private final HashSet<Z> mA = new HashSet<>();

  @Override
  public Z next() {
    mA.add(super.next());
    return Z.valueOf(mA.size());
  }
}

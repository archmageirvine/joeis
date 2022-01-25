package irvine.oeis.a056;
// manually triselect

import irvine.math.z.Z;
import irvine.oeis.a000.A000740;

/**
 * A056278 Number of primitive (aperiodic) word structures of length n which contain exactly two different symbols.
 * @author Georg Fischer
 */
public class A056278 extends A000740 {

  private int mN = 0;

  public Z next() {
    final Z result = super.next();
    return ++mN == 1 ? Z.ZERO : result;
  }
}


package irvine.oeis.a028;

import java.util.BitSet;
import java.util.List;

import irvine.math.z.Z;

/**
 * A028312 Odd numbers k such that {1..k-1} cannot be partitioned into disjoint sets I, J such that 2I == -J (mod k) and I, J are unions of cyclotomic cosets mod k.
 * @author Sean A. Irvine
 */
public class A028312 extends A028311 {

  // Could be done with complement on A028311.

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final List<BitSet> cosets = cosets(mN);
      if (!isA028311(cosets)) {
        return Z.valueOf(mN);
      }
    }
  }
}

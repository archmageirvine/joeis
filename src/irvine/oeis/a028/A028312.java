package irvine.oeis.a028;

import java.util.List;
import java.util.Set;

import irvine.math.z.Z;

/**
 * A028312.
 * @author Sean A. Irvine
 */
public class A028312 extends A028311 {

  // Could be done with complement on A028311.

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final List<Set<Integer>> cosets = cosets(mN);
      //System.out.println("cosets: " + cosets);
      if (!isA028311(cosets)) {
        return Z.valueOf(mN);
      }
    }
  }
}

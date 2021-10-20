package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052061 Numbers k such that decimal expansion of k^2 contains no palindromic substring except single digits.
 * @author Sean A. Irvine
 */
public class A052061 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (A052057.isPalindromeFree(mN.square().toString())) {
        return mN;
      }
    }
  }
}


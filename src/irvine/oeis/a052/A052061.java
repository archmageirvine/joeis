package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A052061 Numbers k such that decimal expansion of k^2 contains no palindromic substring except single digits.
 * @author Sean A. Irvine
 */
public class A052061 extends AbstractSequence {

  /* Construct the sequence. */
  public A052061() {
    super(1);
  }

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


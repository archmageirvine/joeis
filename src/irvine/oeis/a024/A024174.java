package irvine.oeis.a024;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024174 a(n) is floor((4th elementary symmetric function of 1,2,..,n)/(3rd elementary symmetric function of 1,2,...,n)).
 * @author Sean A. Irvine
 */
public class A024174 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Stirling.firstKind(mN + 1, mN - 3).negate().divide(Stirling.firstKind(mN + 1, mN - 2));
  }
}

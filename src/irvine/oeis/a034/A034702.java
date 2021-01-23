package irvine.oeis.a034;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034702 a(n+1) is the smallest number not of the form a(i), a(i) + a(n-1), or |a(i) - a(n-1)|.
 * @author Sean A. Irvine
 */
public class A034702 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN <= 2 ? mN : 3 * mN + 3 - (2L << LongUtils.lg(mN + 2)));
  }
}


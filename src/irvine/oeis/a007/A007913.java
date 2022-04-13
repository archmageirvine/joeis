package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007913 Squarefree part of n: a(n) is the smallest positive number m such that n/m is a square.
 * @author Sean A. Irvine
 */
public class A007913 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).core();
  }
}

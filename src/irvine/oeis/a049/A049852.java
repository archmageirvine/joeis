package irvine.oeis.a049;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049852 Concatenate "n" and "nextprime(n)".
 * @author Sean A. Irvine
 */
public class A049852 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return new Z(++mN + String.valueOf(mPrime.nextPrime(mN)));
  }
}

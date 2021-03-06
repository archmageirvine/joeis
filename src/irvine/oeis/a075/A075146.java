package irvine.oeis.a075;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001597;

/**
 * A075146 n-th perfect power - n-th prime: pp(n) - prime(n).
 * @author Georg Fischer
 */
public class A075146 extends A000040 {
  protected long mN = 0;
  protected final Sequence mPerfPows = new A001597();


  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return mPerfPows.next().subtract(nextPrime);
  }
}

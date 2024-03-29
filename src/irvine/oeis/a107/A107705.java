package irvine.oeis.a107;
// Generated by gen_seq4.pl dersimpln at 2021-08-25 22:45

import irvine.math.z.Z;
import irvine.oeis.a007.A007684;

/**
 * A107705 a(n) is the least number of prime factors in any non-deficient number that has the n-th prime as its least prime factor.
 * @author Georg Fischer
 */
public class A107705 extends A007684 {

  protected int mN;
  
  /** Construct the sequence. */
  public A107705() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().subtract(mN).add(1);
  }
}

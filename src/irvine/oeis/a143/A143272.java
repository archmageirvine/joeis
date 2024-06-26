package irvine.oeis.a143;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A143272 a(n) = d(n)*T(n), where d(n) is the number of divisors of n (A000005) and T(n)=n(n+1)/2 are the triangular numbers (A000217).
 * @author Georg Fischer
 */
public class A143272 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A143272() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.SIGMA0.z(mN).multiply((long) mN * (mN + 1) / 2);
  }
}

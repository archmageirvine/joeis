package irvine.oeis.a099;
// Generated by gen_seq4.pl sigman0/sigma0 at 2023-02-28 21:57

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005408;

/**
 * A099774 Number of divisors of 2*n-1.
 * @author Georg Fischer
 */
public class A099774 extends A005408 {

  /** Construct the sequence. */
  public A099774() {
    super(1);
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}

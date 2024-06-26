package irvine.oeis.a129;
// Generated by gen_seq4.pl knest/eulphi at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006882;

/**
 * A129335 a(n) = phi(n!!) where phi is the Euler totient function. In other words, a(n) = A000010(A006882(n)).
 * @author Georg Fischer
 */
public class A129335 extends A006882 {

  /** Construct the sequence. */
  public A129335() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

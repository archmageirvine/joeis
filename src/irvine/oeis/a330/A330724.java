package irvine.oeis.a330;
// Generated by gen_seq4.pl knest at 2023-03-02 20:46

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a038.A038509;

/**
 * A330724 Sum of prime factors (with multiplicity) of the n-th composite number coprime to 6.
 * @author Georg Fischer
 */
public class A330724 extends A038509 {
  @Override
  public Z next() {
    return Functions.SOPFR.z(super.next());
  }
}

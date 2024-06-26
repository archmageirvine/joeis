package irvine.oeis.a175;
// Generated by gen_seq4.pl sigman0/sigma0 at 2023-02-28 21:57

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004770;

/**
 * A175462 Number of divisors of integers of the form 5 + 8n.
 * @author Georg Fischer
 */
public class A175462 extends Sequence0 {

  private final A004770 mSeq = new A004770();

  @Override
  public Z next() {
    return Functions.SIGMA0.z(mSeq.next());
  }
}

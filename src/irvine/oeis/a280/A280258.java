package irvine.oeis.a280;
// Generated by gen_seq4.pl sumdiv at 2023-04-05 22:33

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A280258 a(n) = Sum_{d|n} pxi(d), where pxi(m) is the product of totatives of m (A001783).
 * @author Georg Fischer
 */
public class A280258 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A280258() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Integers.SINGLETON.product(1, d, k -> (Functions.GCD.l(k, d) == 1) ? Z.valueOf(k) : Z.ONE));
  }
}

package irvine.oeis.a102;
// Generated by gen_seq4.pl sumdiv at 2023-04-05 22:33

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A102354 a(n) is the number of ways n can be written as k^2 * j, 0 &lt; j &lt;= k.
 * @author Georg Fischer
 */
public class A102354 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A102354() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> (Predicates.SQUARE.is(d) && Functions.SQRT.i(d) >= mN / d) ? Z.ONE : Z.ZERO);
  }
}

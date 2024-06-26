package irvine.oeis.a147;
// Generated by gen_seq4.pl sumdiv2/sumdiv at 2023-04-10 10:08

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A147648 Number of distinct even superperfect numbers dividing n.
 * @author Georg Fischer
 */
public class A147648 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A147648() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> ((d & 1) == 0 && (Functions.SIGMA1.z(Jaguar.factor(d).sigma()).compareTo(2L * d) == 0)) ? Z.ONE : Z.ZERO);
  }
}

package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A087990 Number of palindromic divisors of n.
 * @author Georg Fischer
 */
public class A087990 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A087990() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(d).equals(Functions.REVERSE.z(d)) ? Z.ONE : Z.ZERO);
  }
}

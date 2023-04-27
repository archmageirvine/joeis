package irvine.oeis.a104;

import irvine.math.z.Z;
import irvine.oeis.a014.A014085;

/**
 * A104477 Number of successive squarefree intervals between primes.
 * @author Georg Fischer
 */
public class A104477 extends A014085 {

  private int mN = 0;

  /** Construct the sequence. */
  public A104477() {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 0) ? Z.ZERO : super.next().subtract(1);
  }
}

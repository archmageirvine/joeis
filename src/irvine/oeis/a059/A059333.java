package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059333 For 0&lt;=A, 0&lt;=B, n is an A-almost prime; m is a B-almost prime, k = n+m, k is a C-almost prime; a(n) = smallest number m such that A+B=C.
 * @author Sean A. Irvine
 */
public class A059333 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A059333(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A059333() {
    super(1);
  }

  private long mN = 0;

  protected Z f(final Z n) {
    final long a = Functions.BIG_OMEGA.l(n);
    long m = 0;
    while (true) {
      final long b = Functions.BIG_OMEGA.l(++m);
      if (a + b == Functions.BIG_OMEGA.l(n.add(m))) {
        return Z.valueOf(m);
      }
    }
  }

  @Override
  public Z next() {
    return f(Z.valueOf(++mN));
  }
}

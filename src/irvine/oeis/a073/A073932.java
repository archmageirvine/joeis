package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060681;

/**
 * A073932 Define f(n) = n - largest nontrivial divisor of n or f(n) = n-1 if n is a prime [that is, f(n) = A060681(n)]. Form a triangle in which the n-th row contains terms n, f(n), f(f(n)), ... until a 1 is reached; sequence gives triangle read by rows.
 * @author Sean A. Irvine
 */
public class A073932 extends Sequence1 {

  private final DirectSequence mF = DirectSequence.create(new A060681());
  private int mN = 0;
  private int mK = 0;

  @Override
  public Z next() {
    if (mK <= 1) {
      mK = ++mN;
    } else {
      mK = mF.a(mK).intValueExact();
    }
    return Z.valueOf(mK);
  }
}


package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a023.A023022;

/**
 * A062963 a(n) = mu(n) * H(n) where H(n) is A023022.
 * @author Sean A. Irvine
 */
public class A062963 extends Sequence2 {

  private final A023022 mSeq1 = new A023022();
  private long mN = 1;

  @Override
  public Z next() {
    return mSeq1.next().multiply(Functions.MOBIUS.i(++mN));
  }
}


package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001865;

/**
 * A036360 a(n) = Sum_{k=1..n} n! * n^(n-k+1) / (n-k)!.
 * @author Sean A. Irvine
 */
public class A036360 extends Sequence0 {

  private long mN = -1;
  private final Sequence mA = new PrependSequence(new A001865(), 0);

  @Override
  public Z next() {
    return mA.next().multiply(++mN * mN);
  }
}

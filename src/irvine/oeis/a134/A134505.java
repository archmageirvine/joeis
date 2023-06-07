package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a049.A049310;

/**
 * A134505 Replace 0&apos;s with 1&apos;s in triangle A049310, and take absolute values.
 * @author Georg Fischer
 */
public class A134505 extends Sequence1 {

  private final A049310 mSeq = new A049310();

  @Override
  public Z next() {
    final Z result = mSeq.next().abs();
    return result.isZero() ? Z.ONE : result;
  }
}

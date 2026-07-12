package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A085830.
 * @author Sean A. Irvine
 */
public class A121806 extends Sequence1 {

  private final Sequence mP = new A000040().skip(2);

  private Z f(final long x, final long y) {
    return x == 1 ? (y == 1 ? Z.THREE : Z.ONE) : (y == 1 ? Z.TWO : Z.FOUR);
  }

  @Override
  public Z next() {
    return f(mP.next().mod(3), mP.next().mod(3));
  }
}

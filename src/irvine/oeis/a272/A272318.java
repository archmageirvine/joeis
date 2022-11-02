package irvine.oeis.a272;
// manually 2021-09-01

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A272318 Integer values of Lucas number A000032(n)/n.
 * @author Georg Fischer
 */
public class A272318 extends A000032 {

  protected long mN;

  /** Construct the sequence. */
  public A272318() {
    mN = 0;
    setOffset(1);
    super.next(); // skip a(0)
  }

  @Override
  public Z next() {
    while (true) {
      final Z[] quot = super.next().divideAndRemainder(Z.valueOf(++mN));
      if (quot[1].isZero()) {
        return quot[0];
      }
    }
  }

}

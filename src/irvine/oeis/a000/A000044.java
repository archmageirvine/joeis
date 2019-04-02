package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000044 Dying rabbits: a(0) = 1; for 1 &lt;= n &lt;= 12, a(n) = Fibonacci(n); for n &gt;= 13, a(n) = a(n-1) + a(n-2) - a(n-13).
 * @author Sean A. Irvine
 */
public class A000044 implements Sequence {

  private final Z[] mA = {
    Z.ONE,
    Z.ONE,
    Z.ONE,
    Z.TWO,
    Z.THREE,
    Z.FIVE,
    Z.EIGHT,
    Z.valueOf(13),
    Z.valueOf(21),
    Z.valueOf(34),
    Z.valueOf(55),
    Z.valueOf(89),
    Z.valueOf(144),
  };
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < mA.length) {
      return mA[(int) mN];
    }
    final Z a = mA[12].add(mA[11]).subtract(mA[0]);
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[12] = a;
    return a;
  }
}


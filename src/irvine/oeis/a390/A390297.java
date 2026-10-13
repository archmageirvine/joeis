package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A390297 Numbers k such that sigma(k) = psi(k) + tau(k)^3.
 * @author Sean A. Irvine
 */
public class A390297 extends UnionSequence {

  private static final class MySequence extends A000040 {
    private final Z mM;

    /** Construct the sequence. */
    private MySequence(final long m) {
      mM = Z.valueOf(m);
    }

    @Override
    public Z next() {
      while (true) {
        final Z p = super.next();
        if (!mM.mod(p).isZero()) {
          return mM.multiply(p.square());
        }
      }
    }
  }

  /** Construct the sequence. */
  public A390297() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 3429, 24003, 35500, 55008, 77571, 130683, 176364, 177444, 248500, 258500, 263500, 271524, 385056, 402336, 419616, 428922, 524745, 542997, 1134540, 1165860, 1188540, 1234548, 1242108, 1284228, 1309068, 1621500, 1809500, 1836780, 1844500, 1900668, 2816352, 2937312, 3002454, 3111966, 3673215, 6145149, 7941780, 8161020, 8319780, 8654580, 8989596, 9163476, 11350500, 11764500, 12857460, 21783762, 43016043, 60582060, 82351500),
      new MySequence(1293),
      new MySequence(1633),
      new MySequence(1643),
      new MySequence(6906),
      new MySequence(8426),
      new MySequence(8786),
      new MySequence(9051),
      new MySequence(9741),
      new MySequence(9951),
      new MySequence(10011),
      new MySequence(10505),
      new MySequence(10795),
      new MySequence(11005),
      new MySequence(11431),
      new MySequence(11501),
      new MySequence(11891),
      new MySequence(12121),
      new MySequence(48342),
      new MySequence(52854),
      new MySequence(53862),
      new MySequence(54102),
      new MySequence(58982),
      new MySequence(59210),
      new MySequence(59690),
      new MySequence(61502),
      new MySequence(63195),
      new MySequence(64262),
      new MySequence(65895),
      new MySequence(67022),
      new MySequence(68187),
      new MySequence(69657),
      new MySequence(70077),
      new MySequence(71247),
      new MySequence(72633),
      new MySequence(73535),
      new MySequence(74307),
      new MySequence(75565),
      new MySequence(77035),
      new MySequence(80135),
      new MySequence(83237),
      new MySequence(84847),
      new MySequence(356190),
      new MySequence(369978),
      new MySequence(377034),
      new MySequence(378714),
      new MySequence(390786),
      new MySequence(393954),
      new MySequence(401574),
      new MySequence(414470),
      new MySequence(417830),
      new MySequence(433070),
      new MySequence(442365),
      new MySequence(449834),
      new MySequence(461265),
      new MySequence(469154),
      new MySequence(481965),
      new MySequence(498729),
      new MySequence(502665),
      new MySequence(508431),
      new MySequence(520149),
      new MySequence(560945),
      new MySequence(2493330),
      new MySequence(2716530),
      new MySequence(2735502),
      new MySequence(2757678),
      new MySequence(2811018),
      new MySequence(3031490),
      new MySequence(3373755),
      new MySequence(3518655),
      new MySequence(19015710)
    );
  }
}


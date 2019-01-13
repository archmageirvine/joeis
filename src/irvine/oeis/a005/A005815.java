package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005815.
 * @author Sean A. Irvine
 */
public class A005815 implements Sequence {

  /*
     After Vaclav Kotesovec
     A005815 Recurrence (of order 10):

     96*(36*n^5 - 712*n^4 + 5534*n^3 - 20771*n^2 + 36571*n - 22806)*a(n) =
     32*(n-1)*(72*n^6 - 1316*n^5 + 9148*n^4 - 28966*n^3 + 39869*n^2 - 30144*n + 45732)*a(n-1)
     - 32*(n-2)*(n-1)*(72*n^6 - 1676*n^5 + 15748*n^4 - 74396*n^3 + 178684*n^2 - 184829*n + 30319)*a(n-2)
     - 16*(n-3)*(n-2)*(n-1)*(108*n^6 - 2352*n^5 + 20586*n^4 - 92017*n^3 + 216387*n^2 - 238503*n + 74546)*a(n-3)
     + 8*(n-4)*(n-3)*(n-2)*(n-1)*(144*n^6 - 2956*n^5 + 24692*n^4 - 104862*n^3 + 229455*n^2 - 220443*n + 40440)*a(n-4)
     + 4*(n-4)*(n-3)*(n-2)*(n-1)*(144*n^7 - 3352*n^6 + 32756*n^5 - 173360*n^4 + 533096*n^3 - 937619*n^2 + 825089*n - 209446)*a(n-5)
     + 4*(n-5)*(n-4)*(n-3)*(n-2)*(n-1)*(144*n^6 - 3064*n^5 + 26148*n^4 - 113318*n^3 + 255618*n^2 - 264475*n + 76418)*a(n-6)
     - 2*(n-6)*(n-5)*(n-4)*(n-3)*(n-2)*(n-1)*(144*n^6 - 3244*n^5 + 28696*n^4 - 124830*n^3 + 267767*n^2 - 236943*n + 35360)*a(n-7)
     - 4*(n-7)*(n-6)*(n-5)*(n-4)*(n-3)*(n-2)*(n-1)*(36*n^6 - 820*n^5 + 7302*n^4 - 32410*n^3 + 73386*n^2 - 73692*n + 17905)*a(n-8)
     - 2*(n-8)*(n-7)*(n-6)*(n-5)*(n-4)*(n-3)*(n-2)*(n-1)*(36*n^5 - 568*n^4 + 3358*n^3 - 8760*n^2 + 8863*n - 1356)*a(n-9)
     - (n-9)*(n-8)*(n-7)*(n-6)*(n-5)*(n-4)*(n-3)*(n-2)*(n-1)*(36*n^5 - 532*n^4 + 3046*n^3 - 8081*n^2 + 8963*n - 2148)*a(n-10)
  */

  private Z[] mA = {Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE, Z.valueOf(15), Z.valueOf(465), Z.valueOf(19355), Z.valueOf(1024380)};
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < mA.length) {
      return mA[(int) mN];
    }
    final Z n = Z.valueOf(mN);
    Z u = Z.valueOf(mN - 1);
    Z t = mA[9].multiply(n.multiply(72).subtract(1316).multiply(n).add(9148).multiply(n).subtract(28966).multiply(n).add(39869).multiply(n).subtract(30144).multiply(n).add(45732)).multiply(u).multiply(32);
    u = u.multiply(mN - 2);
    t = t.subtract(mA[8].multiply(n.multiply(72).subtract(1676).multiply(n).add(15748).multiply(n).subtract(74396).multiply(n).add(178684).multiply(n).subtract(184829).multiply(n).add(30319)).multiply(u).multiply(32));
    u = u.multiply(mN - 3);
    t = t.subtract(mA[7].multiply(n.multiply(108).subtract(2352).multiply(n).add(20586).multiply(n).subtract(92017).multiply(n).add(216387).multiply(n).subtract(238503).multiply(n).add(74546)).multiply(u).multiply(16));
    u = u.multiply(mN - 4);
    t = t.add(mA[6].multiply(n.multiply(144).subtract(2956).multiply(n).add(24692).multiply(n).subtract(104862).multiply(n).add(229455).multiply(n).subtract(220443).multiply(n).add(40440)).multiply(u).multiply(8));
    t = t.add(mA[5].multiply(n.multiply(144).subtract(3352).multiply(n).add(32756).multiply(n).subtract(173360).multiply(n).add(533096).multiply(n).subtract(937619).multiply(n).add(825089).multiply(n).subtract(209446)).multiply(u).multiply(4));
    u = u.multiply(mN - 5);
    t = t.add(mA[4].multiply(n.multiply(144).subtract(3064).multiply(n).add(26148).multiply(n).subtract(113318).multiply(n).add(255618).multiply(n).subtract(264475).multiply(n).add(76418)).multiply(u).multiply(4));
    u = u.multiply(mN - 6);
    t = t.subtract(mA[3].multiply(n.multiply(144).subtract(3244).multiply(n).add(28696).multiply(n).subtract(124830).multiply(n).add(267767).multiply(n).subtract(236943).multiply(n).add(35360)).multiply(u).multiply2());
    u = u.multiply(mN - 7);
    t = t.subtract(mA[2].multiply(n.multiply(36).subtract(820).multiply(n).add(7302).multiply(n).subtract(32410).multiply(n).add(73386).multiply(n).subtract(73692).multiply(n).add(17905)).multiply(u).multiply(4));
    u = u.multiply(mN - 8);
    t = t.subtract(mA[1].multiply(n.multiply(36).subtract(568).multiply(n).add(3358).multiply(n).subtract(8760).multiply(n).add(8863).multiply(n).subtract(1356)).multiply(u).multiply2());
    u = u.multiply(mN - 9);
    t = t.subtract(mA[0].multiply(n.multiply(36).subtract(532).multiply(n).add(3046).multiply(n).subtract(8081).multiply(n).add(8963).multiply(n).subtract(2148)).multiply(u));
    t = t.divide(n.multiply(36).subtract(712).multiply(n).add(5534).multiply(n).subtract(20771).multiply(n).add(36571).multiply(n).subtract(22806)).divide(96);
    System.arraycopy(mA, 1, mA, 0, 9);
    mA[9] = t;
    return t;
  }
}


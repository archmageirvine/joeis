package irvine.factor.prover;

import irvine.math.z.Z;

/**
 * Perform the computation a Lucas probable prime test.
 * @author Sean A. Irvine
 */
public class LucasProbablePrime {

  private final Z mN;

  LucasProbablePrime(final Z n) {
    mN = n;
  }

  private PrimeStatus runTest(final Z bigD, final Z p, final Z q) {
    if (q.equals(mN)) {
      throw new RuntimeException();
    }
    final Z gcd = mN.gcd(q);
    if (!Z.ONE.equals(gcd)) {
      return PrimeStatus.COMPOSITE;
    }
    final Z delta = mN.add(1);
    final Z d = delta.makeOdd();
    final long s = delta.auxiliary();
    final String bits = delta.toString(2);
    final int len = bits.length() - 1;
    boolean strong = false;

    Z uk = Z.ONE;
    Z vk = p;
    Z qk = q;

    if (Z.ONE.equals(d) && Z.ZERO.equals(vk.mod(mN))) {
      strong = true;
    }

    for (int i = 1; i <= len; ++i) {
      // double the subscript
      uk = uk.modMultiply(vk, mN);
      vk = vk.square().subtract(qk.multiply2()).mod(mN);
      qk = qk.modSquare(mN);
      assert uk.signum() >= 0;
      assert vk.signum() >= 0;
      if (bits.charAt(i) == '1') {
        // increase subscript by 1
        Z uTemp = p.multiply(uk).add(vk);
        if (!uTemp.isEven()) {
          uTemp = uTemp.add(mN);
          assert uTemp.isEven();
        }
        final Z uNew = uTemp.divide2();
        Z vTemp = bigD.multiply(uk).add(p.multiply(vk));
        if (!vTemp.isEven()) {
          vTemp = vTemp.add(mN);
          assert vTemp.isEven();
        }
        final Z vNew = vTemp.divide2();
        qk = qk.modMultiply(q, mN);
        uk = uNew.mod(mN);
        vk = vNew.mod(mN);
        assert uk.signum() >= 0;
        assert vk.signum() >= 0;
      }
      if (i >= len - s) {
        if (i == len - s && Z.ZERO.equals(uk)) {
          strong = true;
        } else if (i < len && Z.ZERO.equals(vk)) {
          strong = true;
        }
      }
    }
    //System.out.println(strong + " " + uk + " " + vk);
    return strong && Z.ZERO.equals(uk) ? PrimeStatus.PROB_PRIME : PrimeStatus.COMPOSITE;
  }

  PrimeStatus runTest() {
    // Find the first d in the sequence 5, -7, 9, -11, 13, -15, ...
    // for which the Jacobi symbol (d/n) is ?1.
    Z d = Z.FIVE;
    boolean negate = false;
    while (true) {
      if ((negate ? d.negate() : d).jacobi(mN) == -1) {
        break;
      }
      d = d.add(2);
      negate = !negate;
    }
    // Set p = 1 and q = (1 - d) / 4.
    final Z q = Z.ONE.subtract(d).divide(4);
    return runTest(d, Z.ONE, q);
  }
}

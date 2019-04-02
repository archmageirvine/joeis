package irvine.oeis.a004;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A004143 From the powers that be.
 * @author Sean A. Irvine
 */
public class A004143 implements Sequence {

  private int mN = 0;
  private int mM1 = 0;

  private ArrayList<Z> mPrimePowers = new ArrayList<>();

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final A000040 primes = new A000040();
      final Z b = primes.next().shiftLeft(mM1 - 1); // 2 ^ m_1
      Z r = b;
      boolean ok = true;
      for (int k = 1; k < mN; ++k) {
        final Z p = primes.next();
        if (k > mPrimePowers.size()) {
          mPrimePowers.add(Z.ONE);
        }
        Z q = mPrimePowers.get(k - 1);
        Z s = null;
        while (q.compareTo(b) < 0) {
          s = q;
          q = q.multiply(p);
        }
        if (s == null) {
          ok = false;
          break;
        }
        mPrimePowers.set(k - 1, s);
        //System.out.println("n=" + mN + " m1=" + mM1 + " r=" + r + " p=" + p + " p^m_i=" + s + " p^(m+1)=" + q);
        if (s.compareTo(r) >= 0) {
          ok = false;
          break;
        }
        r = s;
      }
      if (ok) {
        return Z.valueOf(mM1);
      }
      ++mM1;
    }
  }
}

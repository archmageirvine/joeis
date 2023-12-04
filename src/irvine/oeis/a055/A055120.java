package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A055120 Digital complement of n (replace each nonzero digit d with 10-d).
 * @author Georg Fischer
 */
public class A055120 extends Sequence0 implements DirectSequence {

  private static final int CH10 = '9' + 1;
  private int mN = -1;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

//  private Z a2(final Z n) {
//    return n.isZero() ? Z.ZERO : Z.TEN.pow(n.toString().length()).subtract(n);
//  }

  @Override
  public Z a(final Z n) {
    final String s = n.toString();
    Z r = Z.ZERO;
    for (int k = 0; k < s.length(); ++k) {
      r = r.multiply(10);
      final char digit = s.charAt(k);
      if (digit != '0') {
        r = r.add(CH10 - digit);
      }
    }
    return r;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}


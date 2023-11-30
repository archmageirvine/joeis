package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A102370 "Sloping binary numbers": write numbers in binary under each other (right-justified), read diagonals in upward direction, convert to decimal.
 * @author Georg Fischer
 */
public class A102370 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  /* Maple:
    A102370:=proc(n) local t1, l; t1:=n; 
    for l from 1 to n do if n+l mod 2^l = 0 then t1:=t1+2^l; fi; od: t1; end;
  */
  @Override
  public Z a(final int n) {
    Z t1 = Z.valueOf(n);
    for (int k = 1; k <= n; ++k) {
      final Z k2 = Z.ONE.shiftLeft(k);
      if (Z.valueOf(n + k).mod(k2).isZero()) {
        t1 = t1.add(k2);
      }
    }
    return t1;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}


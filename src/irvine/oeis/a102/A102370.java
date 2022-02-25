package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A102370 &quot;Sloping binary numbers&quot;: write numbers in binary under each other (right-justified),
 * read diagonals in upward direction, convert to decimal.
 * @author Georg Fischer
 */
public class A102370 implements Sequence {

  private long mN = -1;

  /* Maple:
    A102370:=proc(n) local t1, l; t1:=n; 
    for l from 1 to n do if n+l mod 2^l = 0 then t1:=t1+2^l; fi; od: t1; end;
  */
  @Override
  public Z next() {
    ++mN;
    Z t1 = Z.valueOf(mN);
    for (int k = 1; k <= mN; ++k) {
      final Z k2 = Z.ONE.shiftLeft(k);
      if (Z.valueOf(mN + k).mod(k2).isZero()) {
        t1 = t1.add(k2);
      }
    }
    return t1;
  }
}

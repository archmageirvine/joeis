package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A103528 a(n) = Sum_{k = 1..n-1 such that n == k (mod 2^k)} 2^(k-1).
 * @author Georg Fischer
 */
public class A103528 extends Sequence1 {

  private int mN = 0;

  /* Maple:
    f:=proc(n) local t1, k; t1:=0; 
    for k from 1 to n-1 do if n mod 2^k = k then t1:=t1+2^(k-1); fi; od: t1; end;
  */
  @Override
  public Z next() {
    ++mN;
    Z t1 = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      final Z k2 = Z.ONE.shiftLeft(k);
      if (Z.valueOf(mN).mod(k2).equals(k)) {
        t1 = t1.add(k2.shiftRight(1));
      }
    }
    return t1;
  }
}

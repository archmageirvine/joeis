package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064631 4^n = x*3^n+y*2^n+z*1^n, so 4^n equals the sum of a(n)=x+y+z pieces of like powers (=length of right side of solution of this Diophantine equation). Length of solutions obtained with "greedy algorithm" are given in A064630[n]. Here the binary order [A029837] of the length of those solutions is displayed, which "on the average" nearly equals n.
 * @author Sean A. Irvine
 */
public class A064631 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z t = Z.ONE.shiftLeft(2L * ++mN);
    final Z a = Z.THREE.pow(mN);
    final Z[] qr3 = t.divideAndRemainder(a);
    final Z[] qr2 = qr3[1].divideAndRemainder(Z.ONE.shiftLeft(mN));
    return Z.valueOf(qr3[0].add(qr2[0]).add(qr2[1]).bitLength());
  }
}

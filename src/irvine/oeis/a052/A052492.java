package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052492 Initial pile sizes that guarantee a win for player 2 in a variant of Fibonacci NIM where the players may not take one stone.
 * Translated from <a href="https://github.com/loda-lang/loda-programs/blob/main/oeis/052/A052492.asm">here</a>
 * @author Georg Fischer
 */
public class A052492 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z a1 = Z.ZERO;
    Z a4 = Z.ZERO;
    Z a0 = Z.valueOf(mN);
    Z a3 = a0;
    int i2 = mN + 1;
    while (i2 >= 2) {
      a3 = a3.subtract(a4);
      a0 = a3.subtract(i2).add(2).divide2();
      i2 -= 2;
      a3 = a3.add(a1);
      a4 = a0.add(2);
      a1 = a1.add(a4);
    }
    return a3.add(2);
  }
}

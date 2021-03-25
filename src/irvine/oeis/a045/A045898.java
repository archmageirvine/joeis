package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a101.A101608;

/**
 * A045898 a(n) = one of five triples of directions in n-th triple of moves in the optimal solution of the Tower of Hanoi; it is a squarefree sequence over a five-letter alphabet.
 * @author Sean A. Irvine
 */
public class A045898 extends A101608 {

  private int f() {
    return super.next().intValue() - 1;
  }

  @Override
  public Z next() {
    final int v = f() * 243 + f() * 81 + f() * 27 + f() * 9 + f() * 3 + f();
    switch (v) {
      case 104:
        return Z.ONE;
      case 142:
        return Z.TWO;
      case 302:
        return Z.THREE;
      case 140:
        return Z.FOUR;
      case 304:
        return Z.FIVE;
      default:
        throw new RuntimeException("Unexpected: " + v);
    }
  }
}


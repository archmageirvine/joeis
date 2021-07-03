package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048706 XOR-conjugate rules of 1-D cellular automata rules given in A048705.
 * @author Sean A. Irvine
 */
public class A048706 extends A048705 {

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final int p = mExtendedA020652.next().intValueExact();
    final int q = mExtendedA020653.next().intValueExact();
    final int r = p + q;
    for (int k = 0; k < 1 << (2 * r + 1); ++k) {
      final Z zk = Z.valueOf(k);
      final int v = bitI(rule90(rule150(zk, p), q), 2 * r);
      if (bitI(zk, r) != v) {
        sum = sum.add(Z.ONE.shiftLeft(k));
      }
    }
    return sum;
  }
}

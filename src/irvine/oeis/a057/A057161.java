package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a014.A014486;

/**
 * A057161 Signature-permutation of a Catalan Automorphism: rotate one step counterclockwise the triangulations of polygons encoded by A014486.
 * @author Sean A. Irvine
 */
public class A057161 extends A014486 {

  static int binwidth(final Z n) {
    return n.isZero() ? 1 : n.bitLength();
  }

  private static Z nextSubBinTree(final Z nn) {
    Z n = nn;
    Z z = Z.ZERO;
    int c = 0;
    while (c < 1) {
      z = z.multiply2().add(n.mod(2));
      c += n.isEven() ? 1 : -1;
      n = n.divide2();
    }
    return z;
  }

  static Z binTreeLeftBranch(final Z n) {
    return nextSubBinTree(n.divide2());
  }

  static Z binTreeRightBranch(final Z n) {
    return nextSubBinTree(n.divide(Z.ONE.shiftLeft(1 + binwidth(binTreeLeftBranch(n)))));
  }

  static Z rotateTriangularization(final Z nn) {
    Z n = ZUtils.reverse(nn, 2);
    Z z = Z.ZERO;
    int w = 0;
    while (n.isOdd()) {
      final Z s = binTreeRightBranch(n);
      z = z.add(s.shiftLeft(w));
      w += binwidth(s);
      z = z.add(Z.ONE.shiftLeft(w));
      w += 1;
      n = n.divide2();
    }
    return z;
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(rotateTriangularization(super.next()));
  }
}


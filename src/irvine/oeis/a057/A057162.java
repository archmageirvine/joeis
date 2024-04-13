package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057162 Signature-permutation of a Catalan Automorphism: rotate one step clockwise the triangulations of polygons encoded by A014486.
 * @author Sean A. Irvine
 */
public class A057162 extends A014486 {

  private static Z reflectBinTreeAux(final Z n) {
    final Z a = reflectBinTree2(A057161.binTreeLeftBranch(n));
    final Z b = reflectBinTree2(A057161.binTreeRightBranch(n));
    final int al = A057161.binwidth(a);
    return Z.ONE.shiftLeft(al + A057161.binwidth(b)).add(b.shiftLeft(al)).add(a);
  }

  private static Z reflectBinTree2(final Z n) {
    return n.isZero() ? n : reflectBinTreeAux(Functions.REVERSE.z(2, n));
  }

  /**
   * Binary tree reflection.
   * @param nn parameter
   * @return reflection
   */
  public static Z reflectBinTree(final Z nn) {
    return reflectBinTree2(nn).divide2();
  }

  private static Z rotateTriangularizationR(final Z n) {
    return reflectBinTree(A057161.rotateTriangularization(reflectBinTree(n)));
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(rotateTriangularizationR(super.next()));
  }
}


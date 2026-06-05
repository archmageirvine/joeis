package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;

/**
 * A085162 Permutation of natural numbers induced by Catalan Automorphism *A085162.
 * @author Sean A. Irvine
 */
public class A085162 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A057162.reflectBinTree(A085161.s085161(A057162.reflectBinTree(super.next()))));
  }
}

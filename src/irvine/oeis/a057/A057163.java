package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057163 Signature-permutation of a Catalan automorphism: Reflect a rooted plane binary tree; Deutsch's 1998 involution on Dyck paths.
 * @author Sean A. Irvine
 */
public class A057163 extends A014486 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(A057162.reflectBinTree(super.next()));
  }
}


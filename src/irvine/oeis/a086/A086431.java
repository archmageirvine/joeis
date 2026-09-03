package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057164;
import irvine.oeis.a085.A085161;

/**
 * A086431 Involution of natural numbers induced by the Catalan bijection gma086431 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A086431 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A057164.bcr(A085161.s085161(A057164.bcr(super.next()))));
  }
}


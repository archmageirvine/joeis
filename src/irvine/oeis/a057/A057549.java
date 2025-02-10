package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A057549 The local ranks of each term of A057547.
 * @author Sean A. Irvine
 */
public class A057549 extends A057547 {

  @Override
  public Z next() {
    final Z n = super.next();
    return Functions.LOCAL_CATALAN_RANK.z(n.bitLength() / 2, n);
  }
}

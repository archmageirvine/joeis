package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A057124 Local ranks of terms of A057122.
 * @author Sean A. Irvine
 */
public class A057124 extends A057122 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Functions.LOCAL_CATALAN_RANK.z(t.bitLength() / 2, t);
  }
}

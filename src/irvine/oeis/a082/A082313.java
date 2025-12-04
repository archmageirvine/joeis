package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057164;
import irvine.oeis.a057.A057501;
import irvine.oeis.a057.A057502;

/**
 * A082313 Involution of natural numbers: A057501-conjugate of A057164.
 * @author Sean A. Irvine
 */
public class A082313 extends A057502 {

  private final DirectSequence mA = DirectSequence.create(new A014486());

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A057501.rotateHandshakes(A057164.bcr(mA.a(super.next()))));
  }
}

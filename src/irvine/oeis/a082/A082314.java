package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057164;
import irvine.oeis.a057.A057501;

/**
 * A082314 Involution of natural numbers: A057502-conjugate of A057164.
 * @author Sean A. Irvine
 */
public class A082314 extends A057501 {

  private final DirectSequence mA = DirectSequence.create(new A014486());

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A057164.bcr(A057501.rotateHandshakes(mA.a(super.next()))));
  }
}

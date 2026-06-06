package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057164;

/**
 * A085175 Involution of natural numbers induced by the Catalan bijection gma085175 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A085175 extends Sequence0 {

  private final DirectSequence mA014486 = DirectSequence.create(new A014486());
  private final DirectSequence mA085170 = DirectSequence.create(new A085170());
  private final DirectSequence mA085169 = DirectSequence.create(new A085169());

  @Override
  public Z next() {
    return mA085169.a(Functions.GLOBAL_CATALAN_RANK.z(A057164.bcr(mA014486.a(mA085170.next()))));
  }
}

package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002884;

/**
 * A394566 Number of labeled elementary Abelian groups (C_2)^n with a fixed identity.
 * @author Sean A. Irvine
 */
public class A394566 extends Sequence1 {

  private final Sequence mA = new A002884().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return Functions.FACTORIAL.z((1L << ++mN) - 1).divide(mA.next());
  }
}

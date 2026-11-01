package irvine.oeis.a087;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a133.A133181;

/**
 * A087145 Number of distinct disconnected simple symmetric graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A087145 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A133181());
  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> d == mN ? Z.ZERO : mA.a(d));
  }
}

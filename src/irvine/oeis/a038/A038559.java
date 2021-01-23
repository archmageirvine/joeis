package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000110;
import irvine.oeis.a040.A040027;

/**
 * A038559 a(n) = 2*A040027(n-1) + Bell(n), where Bell = A000110.
 * @author Sean A. Irvine
 */
public class A038559 extends A000110  {

  private final Sequence mA = new PrependSequence(new A040027(), 0);

  @Override
  public Z next() {
    return super.next().add(mA.next().multiply2());
  }
}

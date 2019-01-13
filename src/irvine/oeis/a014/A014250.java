package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002379;

/**
 * A014250.
 * @author Sean A. Irvine
 */
public class A014250 extends A002379 {

  private final Sequence mA = new ComplementSequence(new A002379(), Z.ONE);
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

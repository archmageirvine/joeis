package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000032;

/**
 * A014252.
 * @author Sean A. Irvine
 */
public class A014252 extends A000032 {

  private final Sequence mA = new ComplementSequence(new SkipSequence(new A000032(), 3), Z.ONE);
  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000032;

/**
 * A014243.
 * @author Sean A. Irvine
 */
public class A014243 extends A000032 {

  private final Sequence mNotLucas = new ComplementSequence(new SkipSequence(new A000032(), 1), Z.TWO);

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mNotLucas.next());
  }
}

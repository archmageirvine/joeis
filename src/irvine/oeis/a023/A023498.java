package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a001.A001690;

/**
 * A023498.
 * @author Sean A. Irvine
 */
public class A023498 extends A000032 {

  final Sequence mA = new PrependSequence(new A001690(), 1, 2);
  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}

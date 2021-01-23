package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001998;
import irvine.oeis.a002.A002216;

/**
 * A036359 Number of branched catafusenes with n condensed hexagons.
 * @author Sean A. Irvine
 */
public class A036359 extends A002216 {

  {
    super.next(); // skip 0
  }

  private final Sequence mA = new PrependSequence(new A001998(), 1);

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

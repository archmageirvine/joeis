package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a022.A022577;

/**
 * A007250 McKay-Thompson series of class 4a for the Monster group.
 * @author Sean A. Irvine
 */
public class A007250 extends A007249 {

  private Sequence mA = new PrependSequence(new A022577(), Z.ZERO);

  @Override
  public Z next() {
    return super.next().subtract(mA.next().multiply(64));
  }
}

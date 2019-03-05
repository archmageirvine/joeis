package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002612.
 * @author Sean A. Irvine
 */
public class A002612 extends A002609 {

  private final Sequence mA = new A002611();

  @Override
  public Z next() {
    return super.next().add(mA.next().multiply(32));
  }
}

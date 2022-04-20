package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056378 Number of step shifted (decimated) sequences using exactly four different symbols.
 * @author Sean A. Irvine
 */
public class A056378 extends A056373 {

  private final Sequence mA = new A056371();
  private final Sequence mB = new A056372();

  @Override
  public Z next() {
    return super.next().subtract(mB.next().multiply(4)).add(mA.next().multiply(6)).subtract(4);
  }
}

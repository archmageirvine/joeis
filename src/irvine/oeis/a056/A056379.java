package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056379 Number of step shifted (decimated) sequences using exactly five different symbols.
 * @author Sean A. Irvine
 */
public class A056379 extends A056374 {

  private final Sequence mA = new A056371();
  private final Sequence mB = new A056372();
  private final Sequence mC = new A056373();

  @Override
  public Z next() {
    return super.next().subtract(mC.next().multiply(5)).add(mB.next().multiply(10)).subtract(mA.next().multiply(10)).add(5);
  }
}

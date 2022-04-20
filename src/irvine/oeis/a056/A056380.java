package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056380 Number of step shifted (decimated) sequences using exactly six different symbols.
 * @author Sean A. Irvine
 */
public class A056380 extends A056375 {

  private final Sequence mA = new A056371();
  private final Sequence mB = new A056372();
  private final Sequence mC = new A056373();
  private final Sequence mD = new A056374();

  @Override
  public Z next() {
    return super.next()
      .subtract(mD.next().multiply(6))
      .add(mC.next().multiply(15))
      .subtract(mB.next().multiply(20))
      .add(mA.next().multiply(15))
      .subtract(6);
  }
}

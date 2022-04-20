package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056377 Number of step shifted (decimated) sequences using exactly three different symbols.
 * @author Sean A. Irvine
 */
public class A056377 extends A056372 {

  private final Sequence mA = new A056371();

  @Override
  public Z next() {
    return super.next().subtract(mA.next().multiply(3)).add(3);
  }
}

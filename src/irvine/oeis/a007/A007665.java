package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a056.A056556;

/**
 * A007665 Tower of Hanoi with 5 pegs.
 * @author Sean A. Irvine
 */
public class A007665 extends A056556 {

  /** Construct the sequence. */
  public A007665() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z a = super.next();
    return Z.ONE
      .add(a.multiply(a.subtract(1)).divide2())
      .add(mN)
      .subtract(a.multiply(a.add(1)).multiply(a.add(2)).divide(6))
      .shiftLeft(a.longValueExact())
      .subtract(1);
  }
}

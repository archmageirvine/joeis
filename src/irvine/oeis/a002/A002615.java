package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002615 Glaisher's function T_1(n).
 * @author Sean A. Irvine
 */
public class A002615 extends A002288 {

  /** Construct the sequence. */
  public A002615() {
    super(1);
  }

  {
    super.next(); // skip 0th
  }

  private final Sequence mA = new A002614();

  @Override
  public Z next() {
    return super.next().multiply(19).subtract(mA.next());
  }
}

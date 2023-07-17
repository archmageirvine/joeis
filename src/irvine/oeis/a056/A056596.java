package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a027.A027423;
import irvine.oeis.a055.A055993;

/**
 * A056596 Number of nonsquare divisors of n!.
 * @author Sean A. Irvine
 */
public class A056596 extends A027423 {

  /** Construct the sequence. */
  public A056596() {
    super(1);
  }

  private final Sequence mA = new A055993();

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}


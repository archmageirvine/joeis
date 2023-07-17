package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a027.A027423;

/**
 * A030232 Numbers k such that the number of divisors of k! divides the number of divisors of (2k)!.
 * @author Sean A. Irvine
 */
public class A030232 extends A027423 {

  /** Construct the sequence. */
  public A030232() {
    super(1);
  }

  private final Sequence mA = new A027423();
  private long mN = 0;

  {
    mA.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA.next();
      if (mA.next().mod(super.next()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

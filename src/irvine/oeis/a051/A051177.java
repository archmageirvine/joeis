package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A051177 Perfectly partitioned numbers: numbers k that divide the number of partitions p(k).
 * @author Sean A. Irvine
 */
public class A051177 extends A000041 {

  /** Construct the sequence. */
  public A051177() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

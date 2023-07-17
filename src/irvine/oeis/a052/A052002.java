package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A052002 Numbers with an odd number of partitions.
 * @author Sean A. Irvine
 */
public class A052002 extends A000041 {

  /** Construct the sequence. */
  public A052002() {
    super(1);
  }

  @Override
  public Z next() {
    while (super.next().isEven()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}

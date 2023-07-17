package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A004250 Number of partitions of n into 3 or more parts.
 * @author Sean A. Irvine
 */
public class A004250 extends A000041 {

  /** Construct the sequence. */
  public A004250() {
    super(1);
  }

  private long mN = 2;

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(++mN / 2);
  }
}

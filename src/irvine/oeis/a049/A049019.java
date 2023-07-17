package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a036.A036038;
import irvine.oeis.a048.A048996;

/**
 * A049019 Number of preferential arrangements (onto functions) associated with each numeric partition, partitions in Abramowitz and Stegun order, irregular triangle read by rows.
 * @author Sean A. Irvine
 */
public class A049019 extends A048996 {

  /** Construct the sequence. */
  public A049019() {
    super(1);
  }

  private final Sequence mA = new A036038();

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(mA.next());
  }
}

package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a036.A036038;
import irvine.oeis.a048.A048996;

/**
 * A049019 Irregular triangle read by rows: Row n gives numbers of preferential arrangements (onto functions) of n objects that are associated with the partition of n, taken in Abramowitz and Stegun order.
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

package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a001.A001383;

/**
 * A000235 Number of n-node rooted trees of height 3.
 * @author Sean A. Irvine
 */
public class A000235 extends A001383 {

  private final A000041 mPartitions = new A000041();

  /** Construct the sequence. */
  public A000235() {
    super.next(); // skip 0th entry of A001383
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().subtract(mPartitions.next());
  }
}


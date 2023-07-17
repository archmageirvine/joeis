package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a008.A008826;

/**
 * A059355 Number of chains of n-3 partitions in the reduced partition lattice on n elements.
 * @author Sean A. Irvine
 */
public class A059355 extends A008826 {

  /** Construct the sequence. */
  public A059355() {
    super(3);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN + 2).get(mN);
  }
}

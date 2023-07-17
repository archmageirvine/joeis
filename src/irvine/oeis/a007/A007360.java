package irvine.oeis.a007;

import java.util.Collections;

import irvine.math.z.Z;
import irvine.oeis.a051.A051424;

/**
 * A007360 Number of partitions of n into distinct and pairwise relatively prime parts.
 * @author Sean A. Irvine
 */
public class A007360 extends A051424 {

  /** Construct the sequence. */
  public A007360() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return b(mN, mN, Collections.emptySet())
      .subtract(b(mN - 2, mN - 2, Collections.emptySet()));
  }
}

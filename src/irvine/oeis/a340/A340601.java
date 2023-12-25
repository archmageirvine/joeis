package irvine.oeis.a340;
// manually A328988/parmof2 at 2023-12-23 17:31

import irvine.math.z.Z;
import irvine.oeis.a328.A328988;

/**
 * A340601 Number of integer partitions of n of even rank.
 * @author Georg Fischer
 */
public class A340601 extends A328988 {

  private int mN = -1;

  /** Construct the sequence. */
  public A340601() {
    super(0, r -> r % 2 == 0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : get(mN, 1, 1);
  }
}


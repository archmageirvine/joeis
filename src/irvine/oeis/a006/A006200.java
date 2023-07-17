package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a079.A079267;

/**
 * A006200 Number of partitions into pairs.
 * @author Sean A. Irvine
 */
public class A006200 extends A079267 {

  /** Construct the sequence. */
  public A006200() {
    super(1);
  }

  private int mN = 2;

  @Override
  public Z next() {
    return get(++mN, 3);
  }
}

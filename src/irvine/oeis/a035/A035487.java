package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a001.A001966;

/**
 * A035487 Second column of Stolarsky array.
 * @author Sean A. Irvine
 */
public class A035487 extends A001966 {

  /** Construct the sequence. */
  public A035487() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}


package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a001.A001831;

/**
 * A055531 Number of labeled order relations on n nodes in which longest chain has 2 nodes.
 * @author Sean A. Irvine
 */
public class A055531 extends A001831 {

  /** Construct the sequence. */
  public A055531() {
    super(2);
  }

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

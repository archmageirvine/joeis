package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000142;

/**
 * A079584 Number of ones in the binary expansion of n!.
 * @author Georg Fischer
 */
public class A079584 extends A000142 {

  /** Construct the sequence. */
  public A079584() {
    super.next();
  }
  
  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitCounts(super.next(), 2)[1]);
  }
}

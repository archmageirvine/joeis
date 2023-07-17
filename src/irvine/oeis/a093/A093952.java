package irvine.oeis.a093;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A093952 Partition number A000041(n) mod n.
 * @author Georg Fischer
 */
public class A093952 extends A000041 {

  /** Construct the sequence. */
  public A093952() {
    super(1);
  }

  private Z mN = Z.ZERO;

  {
    super.next();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return super.next().mod(mN);
  }
}

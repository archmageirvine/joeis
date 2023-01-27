package irvine.oeis.a180;
// manually etaprod at 2023-01-23 09:32

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;

/**
 * A180318 Expansion of a(-q) in powers of q where a(q) is a cubic AGM function.
 * <code>a(n) = (-1)^n * A004016(n).</code>
 * @author Georg Fischer
 */
public class A180318 extends Sequence0 {

  private int mN = -1;
  private final A004016 mSeq = new A004016();

  @Override
  public Z next() {
    return ((++mN & 1) == 0) ? mSeq.next() : mSeq.next().negate();
  }
}

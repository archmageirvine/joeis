package irvine.oeis.a130;
// manually 2026-07-03/parmof4 at 2026-07-03 19:36

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A130247 Inverse Lucas (A000032) numbers: index k of a Lucas number such that Lucas(k)=n; max(k|Lucas(k) &lt; n), if there is no such index.
 * @author Georg Fischer
 */
public class A130247 extends A130233 {

  private int mK = 0;

  /** Construct the sequence. */
  public A130247() {
    super(1, new A000032(), 0, false);
  }

  @Override
  public Z next() {
    ++mK;
    return super.next().subtract(mK == 2 ? 1 : 0);
  }
}

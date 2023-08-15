package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A114146 Number of threshold functions on n X n grid.
 * @author Georg Fischer
 */
public class A114146 extends Sequence0 {

  private long mN = 0;
  private final A114043 mSeq = new A114043();

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : mSeq.next().multiply2();
  }
}

package irvine.oeis.a215;
// manually convinv/rootet at 2023-02-21 22:24

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a121.A121589;

/**
 * A215690 Expansion of a(q) / b(q) in powers of q where a(), b() are cubic AGM theta functions.
 * @author Georg Fischer
 */
public class A215690 extends Sequence0 {

  private int mN = -1;
  private final A121589 mSeq = new A121589();

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : mSeq.next().multiply(9);
  }
}

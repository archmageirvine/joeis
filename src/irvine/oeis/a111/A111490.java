package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004125;

/**
 * A111490 a(n) = n + Sum_{k=1..n} (n mod k). Row sums of A372727.
 * @author Georg Fischer
 */
public class A111490 extends Sequence0 {

  private final Sequence mA004125 = new PrependSequence(new A004125(), 0);
  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).add(mA004125.next());
  }
}

package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A004074 a(n) = 2*A004001(n) - n, where A004001 is the Hofstadter-Conway $10000 sequence.
 * @author Sean A. Irvine
 */
public class A004074 extends Sequence1 implements DirectSequence {

  private final DirectSequence A004001 = new A004001();
  private long mN = 0;

  @Override
  public Z next() {
    return A004001.next().multiply2().subtract(++mN);
  }


  @Override
  public Z a(final Z n) {
    return A004001.a(n).multiply2().subtract(n);
  }

  @Override
  public Z a(final long n) {
    return A004001.a(n).multiply2().subtract(n);
  }

}

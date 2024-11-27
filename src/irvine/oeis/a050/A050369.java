package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a074.A074206;

/**
 * A050369 Number of ordered factorizations of n into 2 kinds of 2, 3 kinds of 3, ...
 * @author Sean A. Irvine
 */
public class A050369 extends Sequence1 {

  private final Sequence mSeq1 = new A074206().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return mSeq1.next().multiply(++mN);
  }
}

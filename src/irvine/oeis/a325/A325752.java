package irvine.oeis.a325;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a059.A059543;

/**
 * A325752 First term of n-th difference sequence of (floor(r*k)), r = log(3), k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A325752 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Sequence a = new PrependSequence(new A059543(), 0);
    for (long k = 0; k < mN; ++k) {
      a = new DifferenceSequence(a);
    }
    return a.next();
  }
}

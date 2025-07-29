package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a025.A025591;

/**
 * A079058 Least k such that A025591(k)&gt;p(n) (p(n)=the n-th partition number).
 * @author Sean A. Irvine
 */
public class A079058 extends Sequence1 {

  private final Sequence mSeq = new A025591().skip();
  private Z mA = mSeq.next();
  private long mK = 1;
  private long mN = 0;

  @Override
  public Z next() {
    final Z p = Functions.PARTITIONS.z(++mN);
    while (mA.compareTo(p) < 0) {
      ++mK;
      mA = mSeq.next();
    }
    return Z.valueOf(mK);
  }
}


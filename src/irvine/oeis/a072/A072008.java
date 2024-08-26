package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A072008 a(n)=b(3n+1), where b=A072007.
 * @author Sean A. Irvine
 */
public class A072008 extends Sequence1 {

  private final Sequence mSeq = new A072007().skip(2);

  @Override
  public Z next() {
    mSeq.next();
    mSeq.next();
    return mSeq.next();
  }
}

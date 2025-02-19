package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a067.A067180;

/**
 * A073867 Smallest prime whose digital sum is equal to the n-th composite number, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A073867 extends A002808 {

  private final DirectSequence mSeq = new A067180();

  @Override
  public Z next() {
    return mSeq.a(super.next());
  }
}

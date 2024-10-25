package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000043;

/**
 * A139116 a(n) = p*(p-1)/2, where p is A000043(n).
 * @author Georg Fischer
 */
public class A139116 extends Sequence1 {

  private final A000043 mSeq = new A000043();

  @Override
  public Z next() {
    final Z p = mSeq.next();
    return p.multiply(p.subtract(1)).divide2();
  }
}

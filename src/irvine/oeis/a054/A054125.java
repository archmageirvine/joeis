package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054125 Sum of the arrays in A054123 and A054124.
 * @author Georg Fischer
 */
public class A054125 extends A054123 {

  private final Sequence mSeq = new A054124();

  @Override
  public Z next() {
    return super.next().add(mSeq.next());
  }
}

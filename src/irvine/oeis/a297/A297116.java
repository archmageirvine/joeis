package irvine.oeis.a297;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A297116 Odd bisection of A297115, M\u00f6bius transform of A000120 (binary weight of n).
 * @author Georg Fischer
 */
public class A297116 extends Sequence1 {

  private final Sequence mA = new A297115();
  
  @Override
  public Z next() {
    final Z result = mA.next();
    mA.next();
    return result;
  }
}

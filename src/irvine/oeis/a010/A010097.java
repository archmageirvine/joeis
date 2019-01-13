package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A010097.
 * @author Sean A. Irvine
 */
public class A010097 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    final String s = Integer.toBinaryString(n);
    return new Z('1' + get(s.length() - 1).toString(2) + s.substring(1), 2);
  }
}

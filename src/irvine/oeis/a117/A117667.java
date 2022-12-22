package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a191.A191690;

/**
 * A117667 a(n) = n^n-n^(n-1)-n^(n-2)-n^(n-3)-...-n^3-n^2-n.
 * @author Georg Fischer
 */
public class A117667 extends A191690 implements SequenceWithOffset {

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

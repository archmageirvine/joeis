package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;
import irvine.oeis.a002.A002219;

/**
 * A006827 Number of partitions of <code>2n</code> with all subsums different from <code>n</code>.
 * @author Sean A. Irvine
 */
public class A006827 extends A000041 {

  private final A002219 mA = new A002219();

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return super.next().subtract(mA.next());
  }
}

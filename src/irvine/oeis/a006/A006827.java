package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;
import irvine.oeis.a002.A002219;

/**
 * A006827 Number of partitions of 2n with all subsums different from n.
 * @author Sean A. Irvine
 */
public class A006827 extends A000041 {

  /** Construct the sequence. */
  public A006827() {
    super(1);
  }

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

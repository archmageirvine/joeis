package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000796;

/**
 * A001355 Mix digits of pi and e.
 * @author Sean A. Irvine
 */
public class A001355 implements Sequence {

  private Sequence mA = new A000796();
  private Sequence mB = new A001113();

  @Override
  public Z next() {
    final Sequence t = mA;
    mA = mB;
    mB = t;
    return t.next();
  }
}

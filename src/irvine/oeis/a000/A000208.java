package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000208 Number of even sequences with period 2n.
 * @author Sean A. Irvine
 */
public class A000208 implements Sequence {

  private boolean mEven = false;
  private final A000013 mStep1 = new A000013();
  private final A000013 mStep2 = new A000013();

  @Override
  public Z next() {
    mEven = !mEven;
    final Z v = mStep1.next();
    final Z u = mStep2.next();
    mStep2.next();
    if (mEven) {
      return u.add(v).divide2();
    } else {
      return u.divide2();
    }
  }
}


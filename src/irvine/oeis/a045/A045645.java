package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a011.A011545;

/**
 * A045645 Concatenate first n terms of A011545.
 * @author Sean A. Irvine
 */
public class A045645 extends A011545 {

  /** Construct the sequence. */
  public A045645() {
    super(1);
  }

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    mA.append(super.next());
    return new Z(mA);
  }
}

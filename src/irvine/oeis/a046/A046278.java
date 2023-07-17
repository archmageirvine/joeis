package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A046278 Concatenate lucky numbers.
 * @author Sean A. Irvine
 */
public class A046278 extends A000959 {

  /** Construct the sequence. */
  public A046278() {
    super(0);
  }

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    mA.append(super.next());
    return new Z(mA);
  }
}

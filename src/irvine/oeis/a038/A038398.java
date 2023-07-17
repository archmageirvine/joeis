package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A038398 Concatenate first n cubes in reverse order.
 * @author Sean A. Irvine
 */
public class A038398 extends A000578 {

  /** Construct the sequence. */
  public A038398() {
    super(1);
  }

  private final StringBuilder mS = new StringBuilder();

  {
    super.next();
  }

  @Override
  public Z next() {
    mS.insert(0, super.next());
    return new Z(mS);
  }
}

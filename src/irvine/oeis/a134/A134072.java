package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000204;

/**
 * A134072 Concatenation of A000204 Lucas numbers (beginning at 1) in reverse order.
 * @author Sean A. Irvine
 */
public class A134072 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();
  private final A000204 mL = new A000204();

  @Override
  public Z next() {
    mS.insert(0, mL.next().toString());
    return new Z(mS);
  }
}


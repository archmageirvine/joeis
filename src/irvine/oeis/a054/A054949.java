package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054949 Number of labeled semi-strong digraphs on n nodes with an odd number of components.
 * @author Sean A. Irvine
 */
public class A054949 extends A054948 {

  private final Sequence mA = new A054947();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}

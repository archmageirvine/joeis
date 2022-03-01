package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054950 Number of labeled semi-strong digraphs on n nodes with an even number of components.
 * @author Sean A. Irvine
 */
public class A054950 extends A054948 {

  private final Sequence mA = new A054947();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).divide2();
  }
}

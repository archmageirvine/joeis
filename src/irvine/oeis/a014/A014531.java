package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a001.A001006;
import irvine.oeis.a002.A002426;

/**
 * A014531.
 * @author Sean A. Irvine
 */
public class A014531 extends A002426 {

  private final A001006 mA = new A001006();

  {
    next();
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000204;

/**
 * A134072.
 * @author Sean A. Irvine
 */
public class A134072 implements Sequence {

  private final StringBuilder mS = new StringBuilder();
  private final A000204 mL = new A000204();

  @Override
  public Z next() {
    mS.insert(0, mL.next().toString());
    return new Z(mS);
  }
}


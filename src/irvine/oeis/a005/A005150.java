package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005150 Look and Say sequence: describe the previous term! (method A - initial term is 1).
 * @author Sean A. Irvine
 */
public class A005150 extends Sequence1 {

  private String mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "1";
    } else {
      mA = Functions.LOOK_AND_SAY.z(new Z(mA)).toString();
    }
    return new Z(mA);
  }
}


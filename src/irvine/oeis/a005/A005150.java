package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a045.A045918;

/**
 * A005150 Look and Say sequence: describe the previous <code>term!</code> (method <code>A -</code> initial term is <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A005150 implements Sequence {

  private String mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "1";
    } else {
      mA = A045918.lookAndSay(mA);
    }
    return new Z(mA);
  }
}


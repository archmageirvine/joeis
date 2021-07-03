package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.WolframAutomata;

/**
 * A048709 Main diagonal of Family 1 "Rule 90 x Rule 150" array.
 * @author Sean A. Irvine
 */
public class A048709 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = WolframAutomata.step(150, WolframAutomata.step(90, mA));
    }
    return mA;
  }
}

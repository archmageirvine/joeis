package irvine.oeis.a048;

import java.util.BitSet;

import irvine.math.WolframAutomata;
import irvine.math.z.Z;
import irvine.oeis.a038.A038183;

/**
 * A048711.
 * @author Sean A. Irvine
 */
public class A048711 extends A038183 {

  private final WolframAutomata mRule150 = new WolframAutomata(150);

  private Z toZ(final BitSet set) {
    Z result = Z.ZERO;
    for (int k = 0; k < set.length(); ++k) {
      result = result.shiftLeft(1);
      if (set.get(k)) {
        result = result.add(1);
      }
    }
    return result;
  }

  @Override
  public Z next() {
    final Z t = super.next();
    final BitSet b = BitSet.valueOf(t.toByteArray());
    return toZ(mRule150.step(b));
  }
}

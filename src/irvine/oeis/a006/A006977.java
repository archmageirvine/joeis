package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006977 Cellular automaton with Rule <code>230: 000, 001, 010, 011</code>, ..., <code>111 -&gt; 0,1,1,0,0,1,1,1</code>.
 * @author Sean A. Irvine
 */
public class A006977 implements Sequence {

  private static final boolean[] AUTOMATA = {false, true, true, false, false, true, true, true};
  private Z mA = null;

  protected boolean isSet(final int v) {
    return AUTOMATA[v];
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z t = mA.shiftLeft(2);
      Z bit = Z.ONE;
      mA = Z.ZERO;
      while (!Z.ZERO.equals(t)) {
        if (isSet(Z.SEVEN.and(t).intValueExact())) {
          mA = mA.or(bit);
        }
        bit = bit.shiftLeft(1);
        t = t.shiftRight(1);
      }
    }
    mA = mA.makeOdd();
    return mA;
  }
}

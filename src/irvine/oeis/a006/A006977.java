package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006977 Cellular automaton with Rule 230: 000, 001, 010, 011, ..., 111 -&gt; 0,1,1,0,0,1,1,1.
 * @author Sean A. Irvine
 */
public class A006977 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006977(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006977() {
    super(0);
  }

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
      while (!t.isZero()) {
        if (isSet(Z.SEVEN.and(t).intValueExact())) {
          mA = mA.or(bit);
        }
        bit = bit.shiftLeft(1);
        t = t.divide2();
      }
    }
    mA = mA.makeOdd();
    return mA;
  }
}

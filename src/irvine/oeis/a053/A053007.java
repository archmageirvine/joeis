package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A053007 Repeated digits in decimal expansion of e associated with A053684.
 * @author Sean A. Irvine
 */
public class A053007 extends A001113 {

  /** Construct the sequence. */
  public A053007() {
    super(0);
  }

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.equals(t)) {
        return mA;
      }
    }
  }
}

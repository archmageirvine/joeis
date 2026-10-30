package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;

/**
 * A086110 p=prime is substring of 2^p-1.
 * @author Sean A. Irvine
 */
public class A086110 extends AbstractSequence {

  /** Construct the sequence. */
  public A086110() {
    super(0);
  }

  private Z mMod = Z.TEN;
  private A000040 mSeq = new A000040();

  private boolean is(Z t, final Z p) {
    while (t.compareTo(p) >= 0) {
      if (t.mod(mMod).equals(p)) {
        return true;
      }
      t = t.divide(10);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = mSeq.next();
      if (p.compareTo(mMod) >= 0) {
        mMod = mMod.multiply(10);
      }
      final Z t = Z.TWO.pow(p).subtract(1);
      if (is(t, p)) {
        return p;
      }
    }
  }
}


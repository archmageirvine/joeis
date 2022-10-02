package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059662 Positions of the flipped bits (here they are always set from 0 to 1) in the sequence A059661.
 * @author Sean A. Irvine
 */
public class A059662 implements Sequence {

  private Z mA = Z.TWO;

  @Override
  public Z next() {
    int k = 0;
    if (mA == null) {
      mA = Z.TWO;
    } else {
      while (true) {
        if (!mA.testBit(k)) {
          final Z t = mA.setBit(k);
          if (t.isProbablePrime()) {
            mA = t;
            break;
          }
        }
        ++k;
      }
    }
    return Z.valueOf(k);
  }
}

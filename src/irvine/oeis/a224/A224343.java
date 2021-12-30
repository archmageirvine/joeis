package irvine.oeis.a224;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A224343 The digits of Pi, spelled in English and summed with A=1, B=2, ..., Z=26.
 * @author Georg Fischer
 */
public class A224343 extends A000796 {

  private Z[] mTab = new Z[]
    {Z.valueOf(64) // 0
      , Z.valueOf(34) // 1
      , Z.valueOf(58) // 2
      , Z.valueOf(56) // 3
      , Z.valueOf(60) // 4
      , Z.valueOf(42) // 5
      , Z.valueOf(52) // 6
      , Z.valueOf(65) // 7
      , Z.valueOf(49) // 8
      , Z.valueOf(42) // 9
    };

  @Override
  public Z next() {
    return mTab[super.next().intValue()];
  }
}

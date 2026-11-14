package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;

/**
 * A135454 Number of sums payable using exactly n banknotes of denominations 1, 5, 10, 20, 50, 100.
 * @author Sean A. Irvine
 */
public class A135454 extends PrependSequence {

  /** Construct the sequence. */
  public A135454() {
    super(0, new Sequence1() {
      private Z mA = Z.valueOf(462);
      @Override
      public Z next() {
        mA = mA.add(99);
        return mA;
      }
    }, 1, 6, 21, 52, 103, 174, 262, 360, 461);
  }
}


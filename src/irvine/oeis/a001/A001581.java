package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A001581 Winning moves in Fibonacci nim.
 * @author Sean A. Irvine
 */
public class A001581 implements Sequence {

  private final HashSet<Z> mLosers = new HashSet<>();
  private Z mL = Z.NEG_ONE;

  private void augment(final Z v) {
    // We will run out of RAM way before we hit F(50)=12586269025
    for (int k = 0; k < 50; ++k) {
      mLosers.add(Fibonacci.fibonacci(k).add(v));
    }
  }

  @Override
  public Z next() {
    while (true) {
      mL = mL.add(1);
      if (!mLosers.contains(mL)) {
        augment(mL);
        if (!mL.isZero()) {
          return mL;
        }
      }
    }
  }
}

package irvine.oeis.a054;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000959;

/**
 * A054978 Obtained from sequence of lucky numbers (A000959) by taking iterated absolute value differences of terms and extracting the leading diagonal.
 * @author Sean A. Irvine
 */
public class A054978 extends Sequence0 {

  private final Sequence mLucky = new A000959();
  private final List<Z> mDiagonal = new ArrayList<>();

  @Override
  public Z next() {
    Z d = mLucky.next();
    for (int k = 0; k < mDiagonal.size(); ++k) {
      final Z t = mDiagonal.get(k);
      mDiagonal.set(k, d);
      d = d.subtract(t).abs();
    }
    mDiagonal.add(d);
    return d;
  }
}


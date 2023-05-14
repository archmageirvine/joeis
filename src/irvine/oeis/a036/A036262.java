package irvine.oeis.a036;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A036262 Array of numbers read by upward antidiagonals, arising from Gilbreath's conjecture: leading row lists the primes; the following rows give absolute values of differences of previous row.
 * @author Sean A. Irvine
 */
public class A036262 extends A000040 {

  {
    setOffset(0);
  }

  private List<Z> mDiagonal = Collections.emptyList();
  private int mN = 0;

  protected int min() {
    return 0;
  }

  @Override
  public Z next() {
    while (--mN < min()) {
      final List<Z> d = new ArrayList<>();
      Z v = super.next();
      d.add(v);
      for (final Z u : mDiagonal) {
        v = v.subtract(u).abs();
        d.add(v);
      }
      mDiagonal = d;
      mN = mDiagonal.size();
    }
    return mDiagonal.get(mN);
  }
}


package irvine.oeis.a094;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A094353 Smallest integer not yet used such that <code>1 +</code> Product_{k=1..n} a(k) is a square.
 * @author Sean A. Irvine
 */
public class A094353 implements Sequence {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mProduct = Z.ONE;

  @Override
  public Z next() {
    Z v = Z.ZERO;
    while (true) {
      v = v.add(1);
      if (!mUsed.contains(v)) {
        final Z p = mProduct.multiply(v);
        final Z pp = p.add(1);
        pp.sqrtAndRemainder();
        if (pp.auxiliary() == 1) {
          mProduct = p;
          mUsed.add(v);
          return v;
        }
      }
    }
  }
}


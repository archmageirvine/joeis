package irvine.oeis.a074;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A074137 a(1) = 1; then append numbers greater than the previous term so that the n-th term a(n) divides the sum of next a(n) terms.
 * @author Sean A. Irvine
 */
public class A074137 extends CachedSequence {

  /** Construct the sequence. */
  public A074137() {
    super(1);
  }

  private final HashMap<Z, Z> mConstrained = new HashMap<>();

  @Override
  protected Z compute(final Z n) {
    if (Z.ONE.equals(n)) {
      return Z.ONE;
    }
    if (mConstrained.containsKey(n)) {
      final Z pos = mConstrained.remove(n);
      final Z mod = a(pos);
      Z s = Z.ZERO;
      for (Z m = pos.add(1), t = Z.ONE; t.compareTo(mod) < 0; t = t.add(1), m = m.add(1)) {
        s = s.add(a(m));
      }
      Z v = a(n.subtract(1));
      while (true) {
        v = v.add(1);
        if (s.add(v).mod(mod).isZero()) {
          mConstrained.put(v.add(n), n);
          return v;
        }
      }
    } else {
      final Z an = a(n.subtract(1)).add(1);
      mConstrained.put(an.add(n), n);
      return an;
    }
  }
}

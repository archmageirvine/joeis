package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083147 a(1) = 1, a(n) = smallest nontrivial palindromic multiple of a(n-1). a(n) is not equal to a(n-1) or a concatenation of a(n-1) with itself.
 * @author Sean A. Irvine
 */
public class A083147 extends Sequence1 {

  private Z mA = null;
  private final Z mStart;

  protected A083147(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A083147() {
    this(Z.ONE);
  }

  private boolean ok(final Z p, final Z m) {
    if (!Predicates.PALINDROME.is(p)) {
      return false;
    }
    final String s = p.toString();
    final String t = m.toString();
    if (s.length() % t.length() != 0) {
      return true;
    }
    if (!s.startsWith(t)) {
      return true;
    }
    return !t.repeat(s.length() / t.length()).equals(s);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
      return mA;
    }
    Z t = mA;
    while (true) {
      t = t.add(mA);
      if (ok(t, mA)) {
        mA = t;
        return t;
      }
    }
  }
}


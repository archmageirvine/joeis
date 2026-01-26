package irvine.oeis.a392;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A392117 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A392117 extends Sequence1 {

  private final DirectSequence mS;
  private int mN = 0;
  private final HashSet<Z> mU = new HashSet<>();
  private final HashSet<Z> mV = new HashSet<>();

  /*
   * Let s = (s(n)) be an increasing sequence of positive integers, and define sequences u = (u(n)) and v = (v(n)) as follows:
   *  u(1) = s(1);
   *  v(1) = least term of s that is >= u(1) + s(1);
   *  u(n) = least term of s that is not in {u(k) : k < n} and not in {v(k) : k < n};
   * v(n) = least term of s that is >= u(n) + s(n), for n >= 1.
   * Then u is the lower Wythoff partition sequence of s, and v is the upper Wythoff partition sequence of s.
   */

  protected A392117(final DirectSequence seq) {
    mS = seq;
  }

  /** Construct the sequence. */
  public A392117() {
    this(DirectSequence.create(new A000040()));
  }

  protected Z select(final Z lower, final Z upper) {
    return lower;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      final Z u = mS.a(mN);
      int k = 2;
      while (mS.a(k).compareTo(u.multiply2()) < 0) {
        ++k;
      }
      final Z v = mS.a(k);
      mU.add(u);
      mV.add(v);
      return select(u, v);
    }
    int k = 2;
    Z u;
    while (mU.contains(u = mS.a(k)) || mV.contains(u)) {
      ++k;
    }
    final Z t = u.add(mS.a(mN));
    while (mS.a(++k).compareTo(t) < 0) {
      // do nothing
    }
    final Z v = mS.a(k);
    mU.add(u);
    mV.add(v);
    return select(u, v);
  }
}

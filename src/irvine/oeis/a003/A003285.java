package irvine.oeis.a003;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A003285 Period of continued fraction for square root of n (or 0 if n is a square).
 * @author Sean A. Irvine
 */
public class A003285 extends AbstractSequence implements DirectSequence {

  protected long mN = 0;

  protected A003285(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A003285() {
    this(1);
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    final Z[] sqrt = n.sqrtAndRemainder();
    if (sqrt[1].isZero()) {
      return Z.ZERO;
    }
    final Z f0 = sqrt[0];
    Z f = f0;
    final ArrayList<Z> p = new ArrayList<>();
    p.add(Z.ZERO);
    final ArrayList<Z> q = new ArrayList<>();
    q.add(Z.ONE);
    int k = 0;
    while (true) {
      p.add(q.get(k).multiply(f).subtract(p.get(k)));
      q.add(n.subtract(p.get(k + 1).square()).divide(q.get(k)));
      ++k;
      for (int i = 0; i < k; ++i) {
        if (p.get(i).equals(p.get(k)) && q.get(i).equals(q.get(k))) {
          return Z.valueOf(k - i);
        }
      }
      f = p.get(k).add(f0).divide(q.get(k));
    }
  }

}

package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A071887 Conjectured values of n whose trajectory under map x -&gt; A002487(x)*A002487(x+1) does not go into a cycle.
 * @author Sean A. Irvine
 */
public class A071887 implements Sequence {

  private static final int ITERATIONS = Integer.parseInt(System.getProperty("a071887.iterations", "50"));

  private static Z fusc(final Z n) {
    Z k = n;
    Z a = Z.ONE;
    Z b = Z.ZERO;
    while (!Z.ZERO.equals(k)) {
      final Z t = k.makeOdd();
      final long s = k.auxiliary();
      if (s > 0) {
        a = a.add(b.multiply(s));
      }
      b = a.add(b);
      k = t.divide(2);
    }
    return b;
  }

  private int mN = Integer.parseInt(System.getProperty("a071887.start", "1")) - 1;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    final HashSet<Z> seen = new HashSet<>();
    while (true) {
      seen.clear();
      ++mN;
      Z n = Z.valueOf(mN);
      int c = 0;
      while (c++ < ITERATIONS && !seen.contains(n)) {
        if (mVerbose) {
          if (n.bitLength() < 512) {
            System.out.println(mN + "(" + c + ")=" + n);
          } else {
            System.out.println(mN + "(" + c + ")=" + n.bitLength() + " bits");
          }
        }
        seen.add(n);
        n = fusc(n).multiply(fusc(n.add(1)));
      }
      if (!seen.contains(n)) {
        break;
      }
    }
    return Z.valueOf(mN);
  }
}


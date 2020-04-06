package irvine.oeis.a333;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A333368 allocated for Eder Vanzei.
 * @author Sean A. Irvine
 */
public class A333368 extends A002385 {

  private static final class Node implements Comparable<Node> {
    final int mK;
    final int mM;
    final Z mV;

    private Node(final int k, final int m) {
      mK = k;
      mM = m;
      mV = Z.valueOf(m).pow(k * m).multiply(k);
    }

    @Override
    public int compareTo(final Node o) {
      final int c = mV.compareTo(o.mV);
      if (c != 0) {
        return c;
      }
      final int d = Integer.compare(mK, o.mK);
      if (d != 0) {
        return d;
      }
      return Integer.compare(mM, o.mM);
    }
  }

  private final TreeSet<Node> mCandidates = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private int mK = 1;

  @Override
  public Z next() {
    while (true) {
      if (mCandidates.isEmpty() || Z.valueOf(mK).shiftLeft(2 * mK).compareTo(mCandidates.first().mV) <= 0) {
        // start a new k
        mCandidates.add(new Node(mK, 2));
        ++mK;
      }
      final Node node = mCandidates.pollFirst();
      // Bump up the m for this k
      final int k = node.mK;
      final int m = node.mM;
      mCandidates.add(new Node(k, m + 1));
      final Z c = node.mV.subtract(1);
      if (c.compareTo(mPrev) > 0 && c.isProbablePrime()) {
        mPrev = c;
        return c;
      }
    }
  }
}

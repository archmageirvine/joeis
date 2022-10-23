package irvine.oeis.a138;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A138670 Indices of 0's in Stewart's choral sequence.
 * @author Sean A. Irvine
 */
public class A138670 extends Sequence0 {

  private static final class State implements Comparable<State> {
    private final long mN;
    private final int mM;
    private final Z mV;

    private State(final long n, final int m) {
      mN = n;
      mM = m;
      final Z t = Z.THREE.pow(mM - 1);
      mV = t.subtract(1).divide2().add(t.multiply(3 * mN));
    }

    @Override
    public int compareTo(final State state) {
      final int c = mV.compareTo(state.mV);
      if (c != 0) {
        return c;
      }
      return Long.compare(mN, state.mN);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && ((State) obj).mV.equals(mV) && ((State) obj).mN == mN;
    }

    @Override
    public int hashCode() {
      return mV.hashCode();
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private int mM = 1;

  @Override
  public Z next() {
    final Z t = Z.THREE.pow(mM - 1).subtract(1).divide2();
    if (mA.isEmpty() || mA.first().mV.compareTo(t) >= 0) {
      mA.add(new State(0, mM++));
    }
    final State s = mA.pollFirst();
    mA.add(new State(s.mN + 1, s.mM));
    return s.mV;
  }
}

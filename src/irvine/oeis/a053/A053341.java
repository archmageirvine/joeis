package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053341 Euclid-Pocklington primes: primes of the form Product_{i=1..k} prime(i) * prime(k+1)^m + 1 where prime(r) is the r-th prime and Product_{i=1..k} prime(i) &lt; prime(k+1)^m.
 * @author Sean A. Irvine
 */
public class A053341 implements Sequence {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final long mP;

    private State(final Z n, final long p) {
      mN = n;
      mP = p;
    }

    @Override
    public int compareTo(final State o) {
      return mN.compareTo(o.mN);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && ((State) obj).mN.equals(mN);
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }

    @Override
    public String toString() {
      return "(" + mN + "," + mP + ")";
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  {
    mA.add(new State(Z.TWO, 2));
  }
  private final Fast mPrime = new Fast();
  private Z mPrimorial = Z.TWO;
  private long mP = 3;

  private Z low(final Z prod, final long p) {
    Z t = Z.valueOf(p);
    while (t.compareTo(prod) < 0) {
      t = t.multiply(p);
    }
    return prod.multiply(t);
  }

  @Override
  public Z next() {
    while (true) {
      final Z head = mA.first().mN;
      final Z next = low(mPrimorial, mP);
      //System.out.println(mA + " cf. " + next);
      if (next.compareTo(head) < 0) {
        mA.add(new State(next, mP));
        mPrimorial = mPrimorial.multiply(mP);
        mP = mPrime.nextPrime(mP);
      }
      final State s = mA.pollFirst();
      mA.add(new State(s.mN.multiply(s.mP), s.mP));
      final Z t = s.mN.add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

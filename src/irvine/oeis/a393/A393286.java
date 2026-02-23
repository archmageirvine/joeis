package irvine.oeis.a393;

import java.util.HashMap;
import java.util.LinkedList;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006881;

/**
 * A393286 Rectangular array, read by descending antidiagonals; row n gives the positions in A006881 of numbers whose least prime divisor is prime(n).
 * @author Sean A. Irvine
 */
public class A393286 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mS = new A006881();
  private final HashMap<Long, LinkedList<Long>> mA = new HashMap<>();
  private long mP = 0;
  private long mQ = 0;
  private long mM = 0;

  @Override
  public Z next() {
    mQ = mPrime.nextPrime(mQ);
    if (mQ > mP) {
      mP = mPrime.nextPrime(mP);
      mQ = 2;
    }
    while (!mA.containsKey(mQ) || mA.get(mQ).isEmpty()) {
      final long lpf = Functions.LPF.l(mS.next());
      if (!mA.containsKey(lpf)) {
        mA.put(lpf, new LinkedList<>());
      }
      mA.get(lpf).add(++mM);
    }
    return Z.valueOf(mA.get(mQ).pollFirst());
  }
}

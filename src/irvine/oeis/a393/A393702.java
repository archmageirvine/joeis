package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a033.A033992;
import irvine.util.array.DynamicLongArray;

/**
 * A393702 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A393702 extends Sequence0 {

  // This probably needs to be more sophisticated to get a(22)
  //  - it would need patterns which are permutations of 22, 1, 1 or 11, 2, 1

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = -1;
  private long mM = 0;

  private Z handle2p(final int n) {
    // This could be generalized to handle semiprimes

    // n = 2 * p
    // We have patterns p, 2, 1 and 2*p, 1, 1
    final Sequence omegan = new A033992(n);
    final Sequence omegap = new A033992(n / 2);
    Z kn = omegan.next();
    Z kp = omegap.next();
    while (true) {
      if (kn.compareTo(kp) <= 0) {
        final int om1 = Functions.OMEGA.i(kn.subtract(1));
        if (om1 == 1) {
          final int om2 = Functions.OMEGA.i(kn.subtract(2));
          if (om2 == 1) {
            return kn.subtract(2);
          }
          final int op1 = Functions.OMEGA.i(kn.add(1));
          if (op1 == 1) {
            return kn.subtract(1);
          }
        } else {
          final int op1 = Functions.OMEGA.i(kn.add(1));
          if (op1 == 1 && Functions.OMEGA.i(kn.add(2)) == 1) {
            return kn;
          }
        }
        kn = omegan.next();
      } else {
        final int om1 = Functions.OMEGA.i(kp.subtract(1));
        final int om2 = Functions.OMEGA.i(kp.subtract(2));
        if (om1 * om2 == 2) {
          return kp.subtract(2);
        }
        final int op1 = Functions.OMEGA.i(kp.add(1));
        if (om1 * op1 == 2) {
          return kp.subtract(1);
        }
        final int op2 = Functions.OMEGA.i(kp.add(2));
        if (op1 * op2 == 2) {
          return kp;
        }
        kp = omegap.next();
      }
    }
  }

  @Override
  public Z next() {
    if (Predicates.PRIME.is(++mN)) {
      // For a prime, we know that exactly one of k, k+1, k+2 has omega(k)=mN
      // and the other two must be prime powers.
      // Therefore, we generate numbers k such that omega(k) == mN and
      // check the adjacent values/.
      final Sequence omegan = new A033992(mN); // used for prime, omegan.next(), prime
      while (true) {
        final Z k = omegan.next();
        final int om1 = Functions.OMEGA.i(k.subtract(1));
        if (om1 == 1) {
          final int om2 = Functions.OMEGA.i(k.subtract(2));
          if (om2 == 1) {
            return k.subtract(2);
          }
          final int op1 = Functions.OMEGA.i(k.add(1));
          if (op1 == 1) {
            return k.subtract(1);
          }
        } else {
          final int op1 = Functions.OMEGA.i(k.add(1));
          if (op1 == 1 && Functions.OMEGA.i(k.add(2)) == 1) {
            return k;
          }
        }
      }
    }
    if ((mN & 1) == 0 && Predicates.PRIME.is(mN / 2)) {
      return handle2p(mN);
    }
    while (mFirsts.get(mN) == 0) {
      final int omega = Functions.OMEGA.i(++mM) * Functions.OMEGA.i(mM + 1) * Functions.OMEGA.i(mM + 2);
      if (mFirsts.get(omega) == 0) {
        mFirsts.set(omega, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

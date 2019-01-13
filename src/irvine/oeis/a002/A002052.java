package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002052.
 * @author Sean A. Irvine
 */
public class A002052 implements Sequence {

  // Attempted implementation based on description in Suryanarayana paper.
  // Description is not very clear in some places:

  // Let d = 3 (mod 4), d > 0. Let p denote any prime factor of d - x^2 (x < sqrt(d)),
  // p < sqrt(d).  Then h(d) = 2 if p occurs as a "partial quotient" in the simple
  // continued fraction for sqrt(d).

  // The description does not seem to reproduce the sequence as given.

//  private final Fast mPrime = new Fast();
//  private long mD = 5;
//
//  @Override
//  public Z next() {
//    while (true) {
//      mD = mPrime.nextPrime(mD);
//      if ((mD & 3) == 3) {
//        final HashSet<Z> primes = new HashSet<>();
//        for (long x = 1; x * x < mD; ++x) {
//           final FactorSequence fs = Cheetah.factor(mD - x * x);
//          if (!fs.isComplete()) {
//            throw new UnsupportedOperationException();
//          }
//          for (final Z p : fs.toZArray()) {
//            if (p.square().longValueExact() < mD /* && (p.longValueExact() & 3) == 3 */) {
//              primes.add(p);
//            }
//          }
//        }
//        System.out.println("Considering " + mD + " primes " + primes + " cf " + cf(mD) + " " + LongUtils.classNumber(4 * mD) + " " + LongUtils.classNumber(mD) + " " + LongUtils.classNumber(-mD) + " " + LongUtils.classNumber(-4 * mD));
//        //final Convergents conv = new Convergents(CR.valueOf(mD).sqrt().subtract(CR.ONE).inverse());
//        final Convergents conv = new Convergents(CR.valueOf(mD).sqrt());
//        conv.next();
//        //System.out.println("conv=:" + conv.next());
//        final Z end = conv.frac().multiply2();
//        Z t;
//        do {
//          conv.next();
//          //System.out.println("conv=:" + conv.next());
//          t = conv.frac();
//          //System.out.println("CF: " + t);
//          if (primes.remove(t)) {
//            return Z.valueOf(mD);
//          }
//          primes.remove(t);
//          if (primes.isEmpty()) {
//            return Z.valueOf(mD);
//          }
//        } while (!end.equals(t));
//      }
//    }
//  }

  @Override
  public Z next() {
    throw new UnsupportedOperationException();
  }
}

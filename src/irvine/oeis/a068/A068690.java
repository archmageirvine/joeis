package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a014.A014263;

/**
 * A068690 Primes such that all digits (except perhaps the least significant digit) are even.
 * @author Sean A. Irvine
 */
public class A068690 extends PrependSequence {

  /** Construct the sequence. */
  public A068690() {
    super(1, new A014263() {
      {
        super.next(); // skip 0
      }
      private final TreeSet<Z> mQ = new TreeSet<>();

      @Override
      public Z next() {
        while (mQ.isEmpty()) {
          final Z t = super.next().multiply(10);
          final Z t1 = t.add(1);
          if (t1.isProbablePrime()) {
            mQ.add(t1);
          }
          final Z t3 = t.add(3);
          if (t3.isProbablePrime()) {
            mQ.add(t3);
          }
          final Z t7 = t.add(7);
          if (t7.isProbablePrime()) {
            mQ.add(t7);
          }
          final Z t9 = t.add(9);
          if (t9.isProbablePrime()) {
            mQ.add(t9);
          }
        }
        return mQ.pollFirst();
      }
    }, 2, 3, 5, 7);
  }
}

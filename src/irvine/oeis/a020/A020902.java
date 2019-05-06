package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a009.A009490;
import irvine.oeis.a035.A035942;

/**
 * A020902 Number of nonisomorphic cyclic subgroups of alternating group <code>A_n</code> (or number of distinct orders of even permutations of <code>n</code> objects); number of different LCM's of partitions of n which have even number of even parts.
 * @author Sean A. Irvine
 */
public class A020902 extends PrependSequence {

  /** Construct the sequence. */
  public A020902() {
    super(new A009490() {

      private final A035942 mA = new A035942();
      {
        mA.next();
      }
      private Z mPrev = mA.next();

      @Override
      public Z next() {
        final Z t = mPrev;
        mPrev = mA.next();
        return super.next().add(t).add(mPrev);
      }
    }, 1, 1);
  }
}

package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006577;

/**
 * A395508 Record lengths of runs of consecutive numbers whose numbers of Collatz steps to reach 1 are weakly increasing.
 * @author Sean A. Irvine
 */
public class A395508 extends Sequence1 {

  private final Sequence mC = new A006577();
  private long mRecord = 0;

  @Override
  public Z next() {
    long len = 1;
    Z t = mC.next();
    while (true) {
      final Z u = t;
      t = mC.next();
      if (t.compareTo(u) < 0) {
        if (len > mRecord) {
          mRecord = len;
          return Z.valueOf(mRecord);
        }
        len = 0;
      }
      ++len;
    }
  }
}


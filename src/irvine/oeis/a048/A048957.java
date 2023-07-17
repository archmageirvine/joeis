package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001203;

/**
 * A048957 Positions of 3-digit terms in the continued fraction for Pi (3 is at position 0).
 * @author Sean A. Irvine
 */
public class A048957 extends A001203 {

  /** Construct the sequence. */
  public A048957() {
    super(1);
  }

  private static final Z LOWER = Z.valueOf(100);
  private static final Z UPPER = Z.valueOf(1000);
  private long mM = -1;

  @Override
  public Z next() {
    while (true) {
      ++mM;
      final Z t = super.next();
      if (t.compareTo(LOWER) >= 0 && t.compareTo(UPPER) < 0) {
        return Z.valueOf(mM);
      }
    }
  }
}

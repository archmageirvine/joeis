package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a173.A173490;

/**
 * A007621 Impractical numbers: even abundant numbers (A173490) that are not <code>practical(2)</code> (A007620).
 * @author Sean A. Irvine
 */
public class A007621 extends A173490 {

  private final A007620 mSeq = new A007620();
  private Z mA = mSeq.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      while (t.compareTo(mA) > 0) {
        mA = mSeq.next();
      }
      if (!t.equals(mA)) {
        return t;
      }
    }
  }
}

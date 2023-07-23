package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A064635 Even numbers &gt; 6 not appearing in A064466. a(n) = A064466(A064634(n)) + 2 for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A064635 extends AbstractSequence {

  private final A064466 mSeq1 = new A064466();

  /** Construct the sequence. */
  public A064635() {
    super(1);
  }

  private Z mA = mSeq1.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mSeq1.next();
      if (mA.subtract(t).compareTo(Z.TWO) > 0) {
        return t.add(2);
      }
    }
  }
}

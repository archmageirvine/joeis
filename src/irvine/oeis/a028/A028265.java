package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A028265 Odd elements in 3-Pascal triangle A028262 (by row) that are not 1.
 * @author Sean A. Irvine
 */
public class A028265 extends AbstractSequence {

  private final A028264 mSeq1 = new A028264();

  /** Construct the sequence. */
  public A028265() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      if (!Z.ONE.equals(t)) {
        return t;
      }
    }
  }
}

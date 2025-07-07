package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000071;

/**
 * A078620 Floor(average of first n Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A078620 extends Sequence1 {

  private final Sequence mSum = new A000071().skip(2);
  private long mN = 0;

  @Override
  public Z next() {
    return mSum.next().divide(++mN);
  }
}


package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a048.A048559;

/**
 * A051671 Smallest positive number whose digits concatenated with all previous terms forms a perfect square.
 * @author Sean A. Irvine
 */
public class A051671 extends AbstractSequence {

  private final A048559 mSeq1 = new A048559();

  /** Construct the sequence. */
  public A051671() {
    super(0);
  }

  private String mA = "";

  @Override
  public Z next() {
    final String t = mA;
    mA = mSeq1.next().toString();
    return new Z(mA.substring(t.length()));
  }
}


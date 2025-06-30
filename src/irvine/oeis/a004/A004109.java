package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.InterleaveSequence;
import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000004;
import irvine.oeis.a002.A002829;

/**
 * A004109 Number of connected trivalent (or cubic) labeled graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A004109 extends PrependSequence {

  /** Construct the sequence. */
  public A004109() {
    super(0, new PolynomialFieldSequence(2, "", "x,B,log", 0, PolynomialFieldSequence.EGF, 1, 1, PolynomialFieldSequence.egf(new InterleaveSequence(new A002829(), new A000004()))), 1, 1, 1);
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}


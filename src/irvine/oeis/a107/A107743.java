package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a047.A047791;

/**
 * A107743 Numbers m such that m+(digit sum of m) is a composite number.
 * @author Sean A. Irvine
 */
public class A107743 extends ComplementSequence {

  /** Construct the sequence. */
  public A107743() {
    super(new A047791(), Z.ONE);
  }
}

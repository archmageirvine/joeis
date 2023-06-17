package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017764 a(n) = binomial coefficient C(n, 100).
 * @author Sean A. Irvine
 */
public class A017764 extends AbstractSequence {

  /* Construct the sequence. */
  public A017764() {
    super(100);
  }

  private long mN = 99;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 100);
  }
}


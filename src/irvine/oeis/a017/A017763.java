package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017763 a(n) = binomial coefficient C(n, 99).
 * @author Sean A. Irvine
 */
public class A017763 extends AbstractSequence {

  /* Construct the sequence. */
  public A017763() {
    super(99);
  }

  private long mN = 98;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 99);
  }
}


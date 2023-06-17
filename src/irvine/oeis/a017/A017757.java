package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017757 Binomial coefficients C(n, 93).
 * @author Sean A. Irvine
 */
public class A017757 extends AbstractSequence {

  /* Construct the sequence. */
  public A017757() {
    super(93);
  }

  private long mN = 92;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 93);
  }
}


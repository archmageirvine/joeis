package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A017743 Binomial coefficients C(n, 79).
 * @author Sean A. Irvine
 */
public class A017743 extends AbstractSequence {

  /** Construct the sequence. */
  public A017743() {
    super(79);
  }

  private long mN = 78;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 79);
  }
}


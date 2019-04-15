package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010996 Binomial coefficient <code>C(n,43)</code>.
 * @author Sean A. Irvine
 */
public class A010996 implements Sequence {

  private long mN = 42;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 43);
  }
}


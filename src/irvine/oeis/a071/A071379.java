package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a090.A090210;

/**
 * A071379 a(n) = (1/e) * Sum_{k&gt;=0} ((k+4)!/k!)^(n-1)/k!.
 * @author Sean A. Irvine
 */
public class A071379 extends A090210 {

  private int mN = 2;

  /** Construct the sequence. */
  public A071379() {
    super(0);
  }

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}

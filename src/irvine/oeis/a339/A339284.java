package irvine.oeis.a339;

import irvine.math.z.Z;

/**
 * A339284 Number of unoriented series-parallel networks with integer valued elements summing to n.
 * @author Gregory Morse
 */
public class A339284 extends A339231 {
  private int mN = 0;

  /** Construct the sequence. */
  public A339284() {
    super(true, true);
  }

  @Override
  public Z next() {
    return counts(++mN).coeff(0).toZ();
  }
}

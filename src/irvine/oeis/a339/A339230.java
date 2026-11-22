package irvine.oeis.a339;

import irvine.math.z.Z;

/**
 * A339230 Number of oriented series-parallel networks with integer valued elements summing to n.
 * @author Gregory Morse
 */
public class A339230 extends A339231 {
  private int mN = 0;

  /** Construct the sequence. */
  public A339230() {
    super(true, false);
  }

  @Override
  public Z next() {
    return counts(++mN).coeff(0).toZ();
  }
}

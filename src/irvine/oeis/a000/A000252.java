package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000252 Number of invertible 2 X 2 matrices mod n.
 * @author Sean A. Irvine
 */
public class A000252 extends AbstractSequence {

  /** Construct the sequence. */
  public A000252() {
    super(1);
  }

  protected long mN = 0;

  @Override
  public Z next() {
    Z z = Z.valueOf(++mN).pow(4);
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      z = z.multiply(p.square().subtract(Z.ONE)).multiply(p.subtract(Z.ONE)).divide(p.pow(3));
    }
    return z;
  }

}


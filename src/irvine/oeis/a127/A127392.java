package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A127392 Expansion of the elliptic function sqrt(k(q))/q^(1/4) in powers of q, where sqrt(k(q)) = theta_2(q)/theta_3(q).
 * @author Georg Fischer
 */
public class A127392 extends EulerTransform {

  /** Construct the sequence. */
  public A127392() {
    super(new PeriodicSequence(-2, 4, -2, 0), 1);
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

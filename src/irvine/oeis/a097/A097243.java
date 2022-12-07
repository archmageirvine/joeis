package irvine.oeis.a097;

import irvine.math.z.Z;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A097243 Expansion of 1 + 32 * (eta(q^4) / eta(q))^8 in powers of q.
 * @author Georg Fischer
 */
public class A097243 extends EulerTransform {

  private int mN = -1;

  /** Construct the sequence. */
  public A097243() {
    super(new PeriodicSequence(8, 8, 8, 0), 1);
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ONE : super.next().multiply(32);
  }
}

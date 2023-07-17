package irvine.oeis.a121;

import java.util.ArrayList;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A121355 Number of transitive PSL_2(ZZ) actions on a finite labeled set of size n.
 * @author Sean A. Irvine
 */
public class A121355 extends A121357 {

  /** Construct the sequence. */
  public A121355() {
    super(1);
  }

  private final ArrayList<Q> mA = new ArrayList<>();

  {
    super.next();
    mA.add(Q.ZERO);
  }

  @Override
  public Z next() {
    mA.add(super.nextQ());
    return RING.log1p(RING.create(mA), mN).coeff(mN).multiply(mF).toZ();
  }
}

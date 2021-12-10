package irvine.oeis.a035;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a007.A007559;
import irvine.oeis.transform.BellTransform;

/**
 * A035469 Triangle read by rows, the Bell transform of the triple factorial numbers A007559(n+1) without column 0.
 * @author Sean A. Irvine
 */
public class A035469 extends A007559 {

  private final List<Q> mA = new ArrayList<>();
  private BellTransform mBellTransform = null;
  private int mN = 0;
  private int mM = 0;
  {
    super.next();
    mA.add(Q.ZERO);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      mA.add(new Q(super.next()));
      ++mN;
      mM = 1;
      mBellTransform = new BellTransform(mA);
    }
    return mBellTransform.get(mN, mM).toZ();
  }
}


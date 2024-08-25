package irvine.oeis.a071;

import java.util.Iterator;

import irvine.math.q.Q;
import irvine.math.q.QUtils;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071926.
 * @author Sean A. Irvine
 */
public class A071970 extends Sequence1 {

  private final Iterator<Q> mIt = Rationals.SINGLETON.iterator();
  {
    mIt.next();
  }

  @Override
  public Z next() {
    return QUtils.sagher(mIt.next());
  }
}

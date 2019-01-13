package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.q.Rationals;
import irvine.math.q.Q;
import java.util.Iterator;

/**
 * A002487.
 * @author Sean A. Irvine
 */
public class A002487 implements Sequence {

  private final Iterator<Q> mIt = Rationals.SINGLETON.iterator();

  @Override
  public Z next() {
    return mIt.next().num();
  }
}

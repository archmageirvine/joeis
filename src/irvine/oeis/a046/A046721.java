package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a006.A006657;
import irvine.util.Pair;

/**
 * A046721.
 * @author Andrew Howroyd
 * @author Sean A. Irvine (Java port)
 */
public class A046721 extends A006657 {

  @Override
  protected Iterable<Pair<Integer, Z>> initialStates(final MeandersByComponents mbc) {
    return mbc.semiMeanderInitialStates(null); // todo
  }
}

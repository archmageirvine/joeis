package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a006.A006567;

/**
 * A079721 Interemirp sequence: average of emirp pairs, analogous to interprimes.
 * @author Sean A. Irvine
 */
public class A079721 extends A006567 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t).divide2();
  }
}


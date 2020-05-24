package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a050.A050351;

/**
 * A032111 "BIJ" <code>(reversible</code>, indistinct, labeled) transform of 2,2,2,2...
 * @author Sean A. Irvine
 */
public class A032111 extends A050351 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

package irvine.oeis.a032;

import irvine.math.z.Z;

/**
 * A032110 "BIJ" <code>(reversible</code>, indistinct, labeled) transform of 0,1,1,1...
 * @author Sean A. Irvine
 */
public class A032110 extends A032032 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}

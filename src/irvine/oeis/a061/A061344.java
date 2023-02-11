package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061344 Numbers of form p^m + 1, p odd prime, m &gt;= 1.
 * @author Sean A. Irvine
 */
public class A061344 extends A061345 {

  {
    super.next(); // skip 1
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}


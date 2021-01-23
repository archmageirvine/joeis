package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007318;

/**
 * A034852 Rows of (Pascal's triangle - Losanitsch's triangle) (n &gt;= 0, k &gt;= 0).
 * @author Sean A. Irvine
 */
public class A034852 extends A007318 {

  private final Sequence mA = new A034851();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

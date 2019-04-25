package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014201 Number of solutions to <code>x^2+x*y+y^2 &lt;= n</code> excluding <code>(0,0)</code>.
 * @author Sean A. Irvine
 */
public class A014201 extends A014202 {

  @Override
  public Z next() {
    return super.next().multiply(6);
  }
}

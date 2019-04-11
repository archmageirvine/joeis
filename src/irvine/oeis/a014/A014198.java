package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014198 Number of integer solutions to <code>x^2 +</code> y^2 <code>&lt;= n</code> excluding <code>(0,0)</code>.
 * @author Sean A. Irvine
 */
public class A014198 extends A014200 {

  @Override
  public Z next() {
    return super.next().shiftLeft(2);
  }
}

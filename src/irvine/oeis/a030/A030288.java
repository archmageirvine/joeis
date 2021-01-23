package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030288 a(n+1) is smallest square &gt; a(n) having no digits in common with a(n), with a(0) = 0.
 * @author Sean A. Irvine
 */
public class A030288 extends A030287 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030288 <code>a(n+1)</code> is smallest square <code>&gt; a(n)</code> having no digits in common with <code>a(n)</code>, with <code>a(0) = 0</code>.
 * @author Sean A. Irvine
 */
public class A030288 extends A030287 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

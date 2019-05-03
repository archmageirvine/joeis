package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A011248 Twice <code>A000364</code>.
 * @author Sean A. Irvine
 */
public class A011248 extends A000364 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}


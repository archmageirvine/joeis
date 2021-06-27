package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048672 Binary encoding of squarefree numbers (A005117): A048640(n)/2.
 * @author Sean A. Irvine
 */
public class A048672 extends A048640 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}


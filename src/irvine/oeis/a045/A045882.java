package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a020.A020754;

/**
 * A045882 Smallest term of first run of (at least) n consecutive integers which are not squarefree.
 * @author Sean A. Irvine
 */
public class A045882 extends A020754 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

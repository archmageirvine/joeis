package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a034.A034386;

/**
 * A056609 a(n) = rad(n!)/rad(A001142(n)) where rad(n) is the squarefree kernel of n, A007947(n).
 * @author Sean A. Irvine
 */
public class A056609 extends A034386 {

  private final Sequence mA = new A056606();
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}


package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a003.A003714;

/**
 * A035612 Horizontal para-Fibonacci sequence: says which column of Wythoff array (starting column count at 1) contains n.
 * @author Sean A. Irvine
 */
public class A035612 extends A003714 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t= super.next();
    t.makeOdd();
    return Z.valueOf(t.auxiliary() + 1);
  }
}


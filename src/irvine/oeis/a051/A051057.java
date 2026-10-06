package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a048.A048142;

/**
 * A051057 Record subsequence of b(3k+1), b()=A048142().
 * @author Sean A. Irvine
 */
public class A051057 extends Sequence0 {

  private final Sequence mA = new A048142();

  @Override
  public Z next() {
    mA.next();
    final Z t = mA.next();
    mA.next();
    return t;
  }
}

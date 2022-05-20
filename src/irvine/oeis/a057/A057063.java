package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057063 Let P(n) of a sequence s(1),s(2),s(3),... be obtained by leaving s(1),...,s(n) fixed and reverse-cyclically permuting every n consecutive terms thereafter; apply P(2) to 1,2,3,... to get PS(2), then apply P(3) to PS(2) to get PS(3), then apply P(4) to PS(3), etc. The limit of PS(n) is A057063.
 * @author Sean A. Irvine
 */
public class A057063 extends A057033 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().add(1);
  }
}

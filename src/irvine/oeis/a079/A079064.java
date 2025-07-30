package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a028.A028373;
import irvine.oeis.a028.A028374;

/**
 * A079064 a(n) is the next available entirely straight or curved number, depending on whether n contains a straight digit or not.
 * @author Sean A. Irvine
 */
public class A079064 extends Sequence0 {

  private final Sequence mS = new A028373();
  private final Sequence mC = new A028374();
  private long mN = -1;
  private Z mPrev = Z.NEG_ONE;

  @Override
  public Z next() {
    final boolean straight = (Functions.SYNDROME.i(++mN) & 0b0010010010) != 0;
    Z t;
    do {
      t = straight ? mS.next() : mC.next();
    } while (t.compareTo(mPrev) < 0);
    mPrev = t;
    return t;
  }
}


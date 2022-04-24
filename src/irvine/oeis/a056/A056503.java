package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a045.A045674;
import irvine.oeis.a164.A164090;

/**
 * A056503 Number of periodic palindromic structures of length n using a maximum of two different symbols.
 * @author Sean A. Irvine
 */
public class A056503 extends A164090 {

  private final Sequence mA = new A045674();
  private boolean mEven = true;
  {
    mA.next();
  }

  @Override
  public Z next() {
    mEven = !mEven;
    return mEven ? super.next().add(mA.next()).divide2() : super.next().divide2();
  }
}


package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000045;

/**
 * A005013.
 * @author Sean A. Irvine
 */
public class A005013 implements Sequence {

  private Sequence mFibo = new A000045();
  private Sequence mLucas = new A000032();
  private boolean mS = false;

  @Override
  public Z next() {
    mS = !mS;
    final Z a = mFibo.next();
    final Z b = mLucas.next();
    return mS ? a : b;
  }

}


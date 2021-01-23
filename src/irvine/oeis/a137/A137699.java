package irvine.oeis.a137;

import irvine.math.z.Z;

/**
 * A137699 a(n) = the smallest integer &gt; A137698(n) and not coprime to A137698(n). (a(n) = A137698(n) + smallest prime dividing A137698(n).).
 * @author Sean A. Irvine
 */
public class A137699 extends A137698 {

  @Override
  public Z next() {
    super.next();
    return mLastK;
  }
}

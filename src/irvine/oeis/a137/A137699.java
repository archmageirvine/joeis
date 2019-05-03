package irvine.oeis.a137;

import irvine.math.z.Z;

/**
 * A137699 <code>a(n) =</code> the smallest integer <code>&gt; A137698(n)</code> and not coprime to <code>A137698(n). (a(n) = A137698(n) +</code> smallest prime dividing <code>A137698(n).)</code>.
 * @author Sean A. Irvine
 */
public class A137699 extends A137698 {

  @Override
  public Z next() {
    super.next();
    return mLastK;
  }
}

package irvine.oeis.a137;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.math.z.Z;
import irvine.oeis.a081.A081399;

/**
 * A137686 a(n) = Bigomega(Catalan(n)) - round( 3 n /(2 log(n+2))) (= A081399 - A137687).
 * @author Georg Fischer
 */
public class A137686 extends A081399 {

  private final A137687 mSeq2 = new A137687();

  @Override
  public Z next() {
    return super.next().subtract(mSeq2.next());
  }
}

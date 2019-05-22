package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000204;
import irvine.oeis.a090.A090946;

/**
 * A022802 <code>a(n) = L(n+1) + c(n)</code> where <code>L(K) = k-th</code> Lucas number and <code>c(n)</code> is n-th number that is 1 or not a Lucas number.
 * @author Sean A. Irvine
 */
public class A022802 implements Sequence {

  private final Sequence mA = new SkipSequence(new A000204(), 1);
  private final Sequence mB = new PrependSequence(new SkipSequence(new A090946(), 1), 1);

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}

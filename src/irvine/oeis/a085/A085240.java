package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A085240 As exponents &gt; 0 in powers of 2 or 3 (A006899) occur in A085238 exactly twice, a self-inverse permutation of natural numbers is induced.
 * @author Sean A. Irvine
 */
public class A085240 extends Sequence1 {

  private final DirectSequence mS = DirectSequence.create(new A085238().skip());
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = mS.a(++mN);
    long k = 0;
    while (true) {
      if (++k != mN && mS.a(k).equals(t)) {
        return Z.valueOf(k);
      }
    }
  }
}

package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006166 <code>a(0)=0, a(1)=a(2)=1;</code> for <code>n&gt;=1, a(3n+2)=2a(n+1)+a(n), a(3n+1)=a(n+1)+2a(n), a(3n)=3a(n)</code>.
 * @author Sean A. Irvine
 */
public class A006166 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n) {
      case 0:
        return Z.ZERO;
      case 1:
      case 2:
        return Z.ONE;
      default:
        final int m = n / 3;
        switch (n % 3) {
          case 0:
            return get(m).multiply(3);
          case 1:
            return get(m + 1).add(get(m).multiply2());
          default:
            return get(m + 1).multiply(2).add(get(m));
        }
    }
  }
}


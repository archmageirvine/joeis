package irvine.oeis.a083;
// manually 2022-09-03

import irvine.math.z.Z;
import irvine.oeis.a261.A261781;

/**
 * A083385 Total height of all elements in all preferential arrangements of n elements, where elements at the bottom level have height 1.
 * a(n) = A261781(n+1,n)/2.
 * @author Georg Fischer
 */
public class A083385 extends A261781 {

  private int mN = 0;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    ++mN;
    return super.triangleElement(mN + 1, mN).divide2();
  }
}


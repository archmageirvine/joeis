package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A046702 a(n)=a(n-a(n-1))+a(n-1-a(n-2))+a(n-2-a(n-3)), n&gt;3. a(1)=a(2)=a(3)=1.
 * @author Sean A. Irvine
 */
public class A046702 extends MemorySequence {

  {
    add(null); // 0 unused
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return Z.ONE;
    }
    return get(n - get(n - 1).intValueExact()).add(get(n - 1 - get(n - 2).intValueExact())).add(get(n - 2 - get(n - 3).intValueExact()));
  }
}


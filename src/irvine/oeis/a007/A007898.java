package irvine.oeis.a007;

import java.util.ArrayList;

/**
 * A007898 <code>a(n) =</code> psi_c(n), where Product_{k&gt;1} 1/(1-1/k^s)^A007897(k) = Sum_{k&gt;0} psi_c(k)/k^s.
 * @author Sean A. Irvine
 */
public class A007898 extends A007896 {

  private final A007897 mA = new A007897();
  private final ArrayList<Integer> mB = new ArrayList<>();
  {
    mB.add(null);
  }

  @Override
  protected int power(final int k) {
    while (k >= mB.size()) {
      mB.add(mA.next().intValueExact());
    }
    return mB.get(k);
  }
}

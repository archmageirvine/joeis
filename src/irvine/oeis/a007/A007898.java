package irvine.oeis.a007;

import java.util.ArrayList;

/**
 * A007898.
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

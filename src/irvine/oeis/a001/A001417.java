package irvine.oeis.a001;

import java.util.Arrays;

/**
 * A001417 Number of ways of folding a <code>2 X 2</code> X ... X <code>2 n-dimensional</code> map.
 * @author Sean A. Irvine
 */
public class A001417 extends A001415 {

  @Override
  protected int[] getDimensions(final int n) {
    final int[] d = new int[n];
    Arrays.fill(d, 2);
    return d;
  }
}

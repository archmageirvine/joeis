package irvine.oeis.a187;

import irvine.math.z.Z;
import irvine.oeis.a001.A001058;
import irvine.util.string.French;

import java.io.Serializable;
import java.util.Comparator;

/**
 * A187876 1-digit numbers arranged in alphabetical order, then the 2-digit numbers arranged in alphabetical order, then the 3-digit numbers, etc. French version.
 * @author Sean A. Irvine
 */
public class A187876 extends A001058 {

  private static class MyComparator implements Comparator<Z>, Serializable {
    @Override
    public int compare(final Z z1, final Z z2) {
      final String a = French.toFrench(z1.intValue()).replace("-", "").replace(" ", "");
      final String b = French.toFrench(z2.intValue()).replace("-", "").replace(" ", "");
      return a.compareTo(b);
    }
  }

  private final MyComparator mComparator = new MyComparator();

  @Override
  protected Comparator<Z> comparator() {
    return mComparator;
  }

}

package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.util.string.German;

import java.io.Serializable;
import java.util.Comparator;

/**
 * A001061 <code>1-, 2-, 3-</code>, ... digit numbers in alphabetical order in German.
 * @author Sean A. Irvine
 */
public class A001061 extends A001058 {

  private static class MyComparator implements Comparator<Z>, Serializable {
    @Override
    public int compare(final Z z1, final Z z2) {
      final String a = German.SINGLETON.toText(z1.intValue()).replace("\u00DF", "ss");
      final String b = German.SINGLETON.toText(z2.intValue()).replace("\u00DF", "ss");
      return a.compareTo(b);
    }
  }

  private final MyComparator mComparator = new MyComparator();

  @Override
  protected Comparator<Z> comparator() {
    return mComparator;
  }

}

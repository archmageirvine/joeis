package irvine.oeis.a066;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a006.A006156;

/**
 * A066297 Number of ternary squarefree necklaces.
 * @author Sean A. Irvine
 */
public class A066297 extends A006156 {

  private static boolean isSquareFreeNecklace(final HashSet<String> squareFreeWords, final String s) {
    for (int k = 1; k < s.length(); ++k) {
      final String t = s.substring(k) + s.substring(0, k);
      if (!squareFreeWords.contains(t)) {
        return false;
      }
    }
    return true;
  }

  private int countSquareFreeNecklaces(final HashSet<String> squareFreeWords) {
    int cnt = 0;
    for (final String s : squareFreeWords) {
      if (isSquareFreeNecklace(squareFreeWords, s)) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(countSquareFreeNecklaces(mWords));
  }
}


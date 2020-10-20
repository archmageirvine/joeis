package irvine.math;

import java.util.Comparator;

/**
 * Various comparators.
 * @author Sean A. Irvine
 */
public final class Comparators {

  private Comparators() { }

  /** Comparator for lexicographic ordering of integer arrays. */
  public static final Comparator<int[]> LEXICOGRAPHIC = (a, b) -> {
    final int c = Integer.compare(a.length, b.length);
    if (c != 0) {
      return c;
    }
    for (int k = 0; k < a.length; ++k) {
      final int ck = Integer.compare(b[k], a[k]);
      if (ck != 0) {
        return ck;
      }
    }
    return 0;
  };

  /** Comparator for colexicographic ordering of integer arrays. */
  public static final Comparator<int[]> COLEXICOGRAPHIC = (a, b) -> {
    final int c = Integer.compare(a.length, b.length);
    if (c != 0) {
      return c;
    }
    for (int k = a.length - 1; k >= 0; --k) {
      final int ck = Integer.compare(a[k], b[k]);
      if (ck != 0) {
        return ck;
      }
    }
    return 0;
  };
}

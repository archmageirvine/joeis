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

  /** Comparator to sort partitions in Abraham-Stegun order. */
  public static final Comparator<int[]> ABRAHAM_STEGUN = (p1, p2) -> {
    final int c = Integer.compare(p1.length, p2.length);
    if (c != 0) {
      return c;
    }
    for (int k = p1.length - 1; k >= 0; --k) {
      final int d = Integer.compare(p1[k], p2[k]);
      if (d != 0) {
        return d;
      }
    }
    return 0;
  };

  /** Comparator for colexicographic ordering of integer arrays. */
  public static final Comparator<int[]> COLEXICOGRAPHIC = ABRAHAM_STEGUN;

  /** Comparator for reverse colexicographic ordering of integer arrays. */
  public static final Comparator<int[]> REVERSE_COLEXICOGRAPHIC = (a, b) -> {
    final int c = Integer.compare(a.length, b.length);
    if (c != 0) {
      return c;
    }
    for (int k = a.length - 1; k >= 0; --k) {
      final int ck = Integer.compare(b[k], a[k]);
      if (ck != 0) {
        return ck;
      }
    }
    return 0;
  };

  /** Comparator for ordering of integer arrays. */
  public static final Comparator<int[]> INCREASING_LENGTH_DECREASING_VALUE = (a, b) -> {
    final int c = Integer.compare(a.length, b.length);
    if (c != 0) {
      return c;
    }
    for (int k = 0; k < a.length; ++k) {
      final int ck = Integer.compare(a[k], b[k]);
      if (ck != 0) {
        return ck;
      }
    }
    return 0;
  };

}

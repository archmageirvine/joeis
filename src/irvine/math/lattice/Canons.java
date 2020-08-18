package irvine.math.lattice;

import java.util.Arrays;

/**
 * Pre-built canonicalization functions.
 * @author Sean A. Irvine
 */
public final class Canons {

  private Canons() { }

  private static boolean isZero(final long... a) {
    for (final long v : a) {
      if (v != 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * A canonicalizer that translates animals based on an origin.
   * @param lattice underlying lattice
   * @return canonicalizer
   */
  public static Canonicalizer createTranslator(final Lattice lattice) {
    return animal -> {
      final int d = lattice.dimension();
      final long[] minPerDimension = new long[d];
      Arrays.fill(minPerDimension, Long.MAX_VALUE);
      for (final long p : animal.points()) {
        for (int k = 0; k < d; ++k) {
          minPerDimension[k] = Math.min(minPerDimension[k], lattice.ordinate(p, k));
        }
      }
      if (isZero(minPerDimension)) {
        return animal; // This animal was already translated appropriately
      }

      // todo the following is not quite what I want
      // long delta = lattice.toPoint(minPerDimension);

      final int bitsPerDimension = Long.SIZE / d;  // !!! brittle, assumes lattice implementation does this
      long delta = 0;
      for (int k = minPerDimension.length - 1; k >= 0; --k) {
        delta <<= bitsPerDimension;
        delta += minPerDimension[k];
      }

//      System.out.println("Pre-trans");
//      final StringBuilder sb = new StringBuilder();
//      for (final long p : animal) {
//        sb.append(lattice.toString(p));
//      }
//      System.out.println(sb);
//
//      System.out.println("Mins: " + Arrays.toString(minPerDimension));

      final long[] translatedPoints = new long[animal.size()];
      for (int k = 0; k < translatedPoints.length; ++k) {
        translatedPoints[k] = animal.points()[k] - delta;
      }
      final Animal a = new Animal(translatedPoints);
      for (final long p : animal.mForbidden) {
        a.mForbidden.add(p - delta);
      }

//      System.out.println("Post-trans");
//      final StringBuilder sb2 = new StringBuilder();
//      for (final long p : a) {
//        sb2.append(lattice.toString(p));
//      }
//      System.out.println(sb2);

      return a;
    };
  }
}

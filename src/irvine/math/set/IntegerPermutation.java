package irvine.math.set;

import java.util.Arrays;
import java.util.List;

import irvine.math.IntegerUtils;

/**
 * Hold a permutation of integers.  These permutations start at 0 rather
 * than the usual 1.
 * @author Sean A. Irvine
 */
public class IntegerPermutation implements Comparable<IntegerPermutation> {

  /**
   * Calculates common degree of the specified permutations; that is,
   * the largest point moved by the permutations plus one.
   * @param permutations permutations
   * @return larges point moved by specified permutations plus one
   */
  public static int degree(final List<IntegerPermutation> permutations) {
    int r = 0;
    for (final IntegerPermutation p : permutations) {
      r = Math.max(r, p.degree());
    }
    return r;
  }

  private final int[] mPerm;

  /**
   * Create a permutation starting from a 1-based representation
   * @param perm the 1-based permutation
   * @return the 0-based permutation
   */
  public static IntegerPermutation createFromOneBase(final int... perm) {
    final int[] c = Arrays.copyOf(perm, perm.length);
    for (int k = 0; k < c.length; ++k) {
      --c[k];
    }
    return new IntegerPermutation(c);
  }

  /**
   * Construct the identity (or zero) of given length.
   * @param length length to construct
   * @return identity permutation
   */
  public static IntegerPermutation identity(final int length) {
    return new IntegerPermutation(IntegerUtils.identity(new int[length]));
  }

  /**
   * Construct a new 0-based permutation
   * @param perm the permutation
   */
  public IntegerPermutation(final int... perm) {
    mPerm = perm;
  }

  /**
   * Construct a new 0-based permutation
   * @param perm the permutation
   */
  public IntegerPermutation(final byte... perm) {
    mPerm = new int[perm.length];
    for (int k = 0; k < perm.length; ++k) {
      mPerm[k] = perm[k] & 0xFF;
    }
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof IntegerPermutation)) {
      return false;
    }
    final IntegerPermutation other = (IntegerPermutation) obj;
    final int d = degree();
    final int e = other.degree();
    if (d != e) {
      return false;
    }
    for (int k = 0; k < d; ++k) {
      if (image(k) != other.image(k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String toString() {
    return Arrays.toString(mPerm);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(mPerm);
  }

  @Override
  public int compareTo(final IntegerPermutation b) {
    for (int k = 0; k < mPerm.length; ++k) {
      final int c = Integer.compare(mPerm[k], b.image(k));
      if (c != 0) {
        return c;
      }
    }
    return 0;
  }

  /**
   * Image of point.
   * @param key point to get image of
   * @return image
   */
  public int image(final int key) {
    return key < mPerm.length ? mPerm[key] : key;
  }

  /**
   * Test if this permutation is the identity permutation.
   * @return true iff is the identity permutation
   */
  public boolean isIdentity() {
    for (int k = 0; k < mPerm.length; ++k) {
      if (mPerm[k] != k) {
        return false;
      }
    }
    return true;
  }

  /**
   * Perform composition of permutations
   * @param other other permutation
   * @return this permutation composed with the given permutation
   */
  public IntegerPermutation compose(final IntegerPermutation other) {
    final int[] r = new int[Math.max(degree(), other.degree())];
    for (int k = 0; k < r.length; ++k) {
      r[k] = other.image(image(k));
    }
    return new IntegerPermutation(r);
  }

  /**
   * Construct the inverse of this permutation.
   * @return inverse permutation
   */
  public IntegerPermutation inverse() {
    final int[] r = new int[mPerm.length];
    for (int k = 0; k < r.length; ++k) {
      r[mPerm[k]] = k;
    }
    return new IntegerPermutation(r);
  }

  /**
   * The largest non-fixed element of the permutation.
   * @return degree
   */
  public int degree() {
    int k;
    for (k = mPerm.length - 1; k >= 0; --k) {
      if (mPerm[k] != k) {
        break;
      }
    }
    return k + 1;
  }
}
